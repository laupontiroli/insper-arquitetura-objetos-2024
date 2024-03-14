package br.insper.loja.compra;

import br.insper.loja.cliente.Cliente;
import br.insper.loja.pagamento.MeioPagamento;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Compra {

    private LocalDateTime dataCompra;
    private Double precoTotal;
    private Cliente cliente;

    private ArrayList<Item> itens = new ArrayList<>();

    private MeioPagamento meioPagamento;

    public LocalDateTime getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDateTime dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public MeioPagamento getMeioPagamento() {
        return meioPagamento;
    }

    public void setMeioPagamento(MeioPagamento meioPagamento) {
        this.meioPagamento = meioPagamento;
    }
}
