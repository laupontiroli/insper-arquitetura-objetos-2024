package org.example.pagamento;

import java.time.LocalDateTime;

public class Boleto extends MeioPagamento {
    private String codigoBarra;

    public Boleto() {
    }

    public Boleto(boolean aprovado, LocalDateTime dataAprovacao, String codigoBarra) {
        super(aprovado, dataAprovacao);
        this.codigoBarra = codigoBarra;
    }
}