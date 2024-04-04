package br.insper.loja;

import br.insper.loja.objetos.Circulo;
import br.insper.loja.objetos.Gira;
import br.insper.loja.veiculos.Aviao;
import br.insper.loja.veiculos.VeiculoQueVoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		Gira gira = new Circulo();

		VeiculoQueVoa aviao = new Aviao();
	}

}
