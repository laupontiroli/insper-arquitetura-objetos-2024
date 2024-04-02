package br.insper.loja.time;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TimeService {

    private ArrayList<Time> times = new ArrayList<>();

    public Time cadastrarTime(Time time) {
        if (time.getNome().equals("")
                || time.getIdentificador().equals("")) {
            throw  new RuntimeException("Dados invalidos");
        } else {
            times.add(time);
            return time;
        }
    }

    public ArrayList<Time> listarTimes(String estado) {
        if (estado != null) {
            ArrayList<Time> lista = new ArrayList<>();
            for (Time time : times) {
                if (time.getEstado().equals(estado)) {
                    lista.add(time);
                }
            }
            return lista;
        }
        return times;
    }

    public Time getTime(String identificador) {
        for (Time time : times) {
            if (time.getIdentificador().equals(identificador)) {
                return time;
            }
        }
        return null;
    }

}