package org.example.pagamento;

import java.time.LocalDateTime;

public class CartaoCredito extends MeioPagamento {
    private String numeroCartao;
    private String bandeira;

    public CartaoCredito() {
    }

    public CartaoCredito(boolean aprovado, LocalDateTime dataAprovacao, String numeroCartao) {
        super(aprovado, dataAprovacao);
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}
