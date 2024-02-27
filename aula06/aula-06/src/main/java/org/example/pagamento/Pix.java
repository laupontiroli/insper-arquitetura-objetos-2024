package org.example.pagamento;

import java.time.LocalDateTime;

public class Pix extends MeioPagamento {
    private String chaveOrigem;
    private String qrCode;

    public Pix() {
    }

    public Pix(boolean aprovado, LocalDateTime dataAprovacao, String chaveOrigem, String qrCode) {
        super(aprovado, dataAprovacao);
        this.chaveOrigem = chaveOrigem;
        this.qrCode = qrCode;
    }
}
