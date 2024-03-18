package br.insper.loja.compra;

import br.insper.loja.cliente.Cliente;
import br.insper.loja.cliente.ClienteService;
import br.insper.loja.produto.Produto;
import br.insper.loja.produto.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

@Service
public class CompraService {

    private ArrayList<Compra> compras = new ArrayList<>();

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ProdutoService produtoService;

    public Compra cadastrarCompra(Compra compra) {


        Cliente cliente = clienteService.getCliente(compra.getCliente().getCpf());
        if (cliente == null) {
            throw new RuntimeException("Cliente nao encontrado");
        }
        compra.setIdentificador(UUID.randomUUID().toString());
        compra.setCliente(cliente);

        for (Item item : compra.getItens()) {
            Produto produto = produtoService.getProduto(item.getProduto().getNome());
            if (produto == null) {
                throw new RuntimeException("Produto nao encontrado");
            }
            item.setProduto(produto);
        }

        compra.getMeioPagamento().setDataAprovacao(LocalDateTime.now());
        compras.add(compra);

        return compra;
    }


    public ArrayList<Compra> listarCompras() {
        return compras;
    }
}
