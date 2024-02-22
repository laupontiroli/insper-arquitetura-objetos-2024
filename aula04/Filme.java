package org.example;


import java.time.LocalDate;
import java.util.ArrayList;

public class Filme {

    private String nome;
    private Integer ano;
    private ArrayList<String> atores = new ArrayList<>();

    public Filme() {
    }

    public Filme(String nome) {
        this.nome = nome;
    }

    public Filme(String nome, Integer ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public Boolean adicionaAtor(String nome) {
        if (nome != null) {
            atores.add(nome);
            return true;
        }
        return false;
    }

    public void calculoAnosLancamento() {
        Integer anoAtual = LocalDate.now().getYear();
        System.out.println(anoAtual - this.ano);
    }

    public Integer calculoAnosLancamentoReturn() {
        Integer anoAtual = LocalDate.now().getYear();
        return anoAtual - this.ano;
    }

    public Integer calculaAniversario() {
        return 0;
    }

    public void limparListaAtores() {
        this.atores.clear();
    }

    public String getNome() {
        return nome;
    }
}
