package br.insper.loja.pagamento;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.time.LocalDateTime;

@JsonTypeInfo(
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "tipo",
        use = JsonTypeInfo.Id.NAME,
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Boleto.class, name = "BOLETO"),
        @JsonSubTypes.Type(value = CartaoCredito.class, name = "CARTAO"),
        @JsonSubTypes.Type(value = Pix.class, name = "PIX")
})
public class MeioPagamento {
    protected Boolean aprovado;
    protected LocalDateTime dataAprovacao;
    protected String tipo;

    public MeioPagamento() {
    }

    public MeioPagamento(boolean aprovado, LocalDateTime dataAprovacao) {
        this.aprovado = aprovado;
        this.dataAprovacao = dataAprovacao;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    public LocalDateTime getDataAprovacao() {
        return dataAprovacao;
    }

    public void setDataAprovacao(LocalDateTime dataAprovacao) {
        this.dataAprovacao = dataAprovacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
