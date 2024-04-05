package br.insper.loja.campeonato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CampeonatoService {

    @Autowired
    private CampeonatoRepository campeonatoRepository;

    public Campeonato cadastrarCampeonato(Campeonato campeonato) {
        if (campeonato.getNome().equals("")) {
            return null;
        } else {
            return campeonatoRepository.save(campeonato);
        }
    }

    public List<Campeonato> listarCampeonatos(String nome) {
        List<Campeonato> campeonatos = campeonatoRepository.findAll();
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

    public Campeonato getCampeonato(Integer id) {
        return campeonatoRepository.getById(id);
    }

}