package br.insper.loja.teste;

import org.apache.commons.lang3.NotImplementedException;

public class Carro implements Veiculo {

    private Integer velocidade;

    @Override
    public void acelera() {
        velocidade = velocidade + 10;
    }

    @Override
    public void brecar() {
        velocidade = velocidade - 10;
    }

}
