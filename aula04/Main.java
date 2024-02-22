package org.example;

public class Main {

    public static void main(String[] args) {


        Filme filme = new Filme("abc", 2023);

        filme.adicionaAtor("ator 1");
        filme.adicionaAtor("ator 2");
        Integer x = filme.calculaAniversario();


        System.out.println(filme.getNome());


    }

}