package br.insper.loja.partida;

import br.insper.loja.campeonato.Campeonato;
import br.insper.loja.time.Time;
import br.insper.loja.time.TimeService;
import br.insper.loja.campeonato.CampeonatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PartidaService {

    private ArrayList<Partida> partidas = new ArrayList<>();

    @Autowired
    private TimeService timeService;

    @Autowired
    private CampeonatoService campeonatoService;

    public Partida cadastrarPartida(Partida partida) {

        Time mandante = timeService.getTime(partida.getMandante().getId());
        Time visitante = timeService.getTime(partida.getMandante().getId());

        if (mandante == null ||  visitante == null) {
            throw new RuntimeException("Time na encotrado");
        }

        Campeonato campeonato =  campeonatoService.getCampeonato(partida.getCampeonato().getIdentificador());

        if (campeonato == null) {
            throw new RuntimeException("Campeonato na encotrado");
        }

        partidas.add(partida);
        return partida;

    }

    public ArrayList<Partida> listarPartidas(String mandante) {
        if  (mandante != null) {
            ArrayList<Partida> lista = new ArrayList<>();
            for (Partida partida  : partidas) {
                if (partida.getMandante().getIdentificador().equals(mandante))  {
                    lista.add(partida);
                }
            }
            return lista;
        }
        return partidas;
    }

    public ArrayList<Partida> listarPartidasCampeonato(String campeonato) {
        ArrayList<Partida> lista = new ArrayList<>();
        for (Partida partida  : partidas) {
            if (partida.getCampeonato().getIdentificador().equals(campeonato))  {
                lista.add(partida);
            }
        }
        return lista;
    }

    public Integer contaVitorias(String time) {
        Integer total = 0;

        for (Partida partida : partidas) {
            if (partida.getMandante().getIdentificador().equals(time)) {
                if (partida.getPlacarMandante() > partida.getPlacarVisitante()) {
                    total++;
                }
            }
            if (partida.getVisitante().getIdentificador().equals(time)) {
                if (partida.getPlacarVisitante() > partida.getPlacarMandante()) {
                    total++;
                }
            }
        }


        return total;
    }
}
