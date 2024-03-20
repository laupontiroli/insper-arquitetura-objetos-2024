package br.insper.loja.time;

public class Time {

    private String nome;
    private String identificador;
    private String estadio;
    private String estado;

    public Time(String nome, String identificador, String estadio, String estado) {
        this.nome = nome;
        this.identificador = identificador;
        this.estadio = estadio;
        this.estado = estado;
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

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
