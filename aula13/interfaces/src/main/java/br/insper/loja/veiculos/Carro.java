package br.insper.loja.veiculos;

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
