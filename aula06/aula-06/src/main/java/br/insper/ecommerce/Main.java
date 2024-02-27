package br.insper.ecommerce;

import br.insper.ecommerce.cliente.Cliente;
import br.insper.ecommerce.compra.Compra;
import br.insper.ecommerce.compra.Item;
import br.insper.ecommerce.pagamento.Boleto;
import br.insper.ecommerce.pagamento.CartaoCredito;
import br.insper.ecommerce.pagamento.MeioPagamento;
import br.insper.ecommerce.pagamento.Pix;
import br.insper.ecommerce.produto.Produto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setCpf("123");
        cliente.setNome("Eduardo");
        cliente.setDataNascimento(LocalDate.now());
        cliente.setNome("Joao");

        System.out.println(cliente.getNome());

        Cliente cliente2 = new Cliente("Eduardo",
                "123",  LocalDate.now());
        cliente2.setNome("Luiz");
        System.out.println(cliente2.getNome());

        Produto produto = new Produto();



        Pix pix = new Pix();
        pix.setAprovado(true);
        pix.setDataAprovacao(LocalDateTime.now());
        pix.setChaveOrigem("123");
        pix.setQrCode("12345");


        Produto produto1 = new Produto("TV", 5000D);

        Compra compra = new Compra();
        compra.setDataCompra(LocalDateTime.now());
        compra.setCliente(cliente2);
        compra.setMeioPagamento(pix);

        Item  item = new Item();
        item.setQuantidade(3);
        item.setProduto(produto1);

        compra.adicionarItem(item);

        compra.calculaPrecoTotal();

        System.out.println(compra.getPrecoTotal());

        MeioPagamento m1 = new Pix();
        MeioPagamento m2 = new CartaoCredito();
        MeioPagamento m3 = new Boleto();

        Pix pix2 = (Pix) m1;


    }

}