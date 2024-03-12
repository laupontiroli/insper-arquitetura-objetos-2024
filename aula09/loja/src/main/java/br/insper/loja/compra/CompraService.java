package br.insper.loja.compra;

import br.insper.loja.cliente.Cliente;
import br.insper.loja.cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CompraService {

    private ArrayList<Compra> compras = new ArrayList<>();

    @Autowired
    private ClienteService clienteService;

    public void cadastrarCompra(Compra compra) {

        Cliente cliente = clienteService.getCliente(compra.getCliente().getCpf());
        if (cliente == null) {
            throw new RuntimeException("Cliente nao encontrado");
        }
        compra.setCliente(cliente);
        compras.add(compra);
    }


    public ArrayList<Compra> listarCompras() {
        return compras;
    }
}
