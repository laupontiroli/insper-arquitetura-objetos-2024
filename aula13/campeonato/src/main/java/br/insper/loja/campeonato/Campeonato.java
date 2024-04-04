package br.insper.loja.campeonato;

public class Campeonato {
    private String nome;
    private String identificador;

    public Campeonato() {
    }

    public Campeonato(String nome, String identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

}
