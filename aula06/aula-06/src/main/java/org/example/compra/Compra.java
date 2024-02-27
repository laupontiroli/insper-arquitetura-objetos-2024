package org.example.compra;

import org.example.cliente.Cliente;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Compra {

    private LocalDateTime dataCompra;
    private Double precoTotal;
    private Cliente cliente;

    private ArrayList<Item> itens = new ArrayList<>();

    public Compra() {
    }

    public Compra(LocalDateTime dataCompra, Double precoTotal, Cliente cliente) {
        this.dataCompra = dataCompra;
        this.precoTotal = precoTotal;
        this.cliente = cliente;
    }

    public void calculaPrecoTotal() {
        Double total = 0D;
        for (Item item : itens) {
            total = total + item.getQuantidade() * item.getProduto().getPreco();
        }
        this.precoTotal =  total;
    }

    public LocalDateTime getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDateTime dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
