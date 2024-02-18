package org.example;


import java.time.LocalDate;
import java.util.ArrayList;

public class Filme {

    String nome;
    Integer ano;
    ArrayList<String> atores = new ArrayList<>();

    Boolean adicionaAtor(String nome) {
        if (nome != null) {
            atores.add(nome);
            return true;
        }
        return false;
    }

    void calculoAnosLancamento() {
        Integer anoAtual = LocalDate.now().getYear();
        System.out.println(anoAtual - this.ano);
    }

    Integer calculoAnosLancamentoReturn() {
        Integer anoAtual = LocalDate.now().getYear();
        return anoAtual - this.ano;
    }


}
