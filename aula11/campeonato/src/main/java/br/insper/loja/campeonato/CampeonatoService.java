package br.insper.loja.campeonato;

import br.insper.loja.compra.Partida;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CampeonatoService {

    private ArrayList<Campeonato> campeonatos = new ArrayList<>();

    public Campeonato cadastrarCampeonato(Campeonato campeonato) {
        if (campeonato.getNome().equals("")) {
            return null;
        } else {
            campeonatos.add(campeonato);
            return campeonato;
        }
    }

    public ArrayList<Campeonato> listarCampeonatos(String nome) {
        if (nome != null) {
            ArrayList<Campeonato> lista = new ArrayList<>();
            for (Campeonato campeonato : campeonatos) {
                if (campeonato.getNome().startsWith(nome)) {
                    lista.add(campeonato);
                }
            }
            return lista;
        }
        return campeonatos;
    }

    public Campeonato getCampeonato(String identificador) {
        for (Campeonato campeonato : campeonatos) {
            if (campeonato.getNome().equals(identificador)) {
                return campeonato;
            }
        }
        return null;
    }

}