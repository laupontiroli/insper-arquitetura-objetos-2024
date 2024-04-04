package br.insper.loja.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TimeService {

    @Autowired
    private TimeRepository timeRepository;

    public Time cadastrarTime(Time time) {
        if (time.getNome().equals("")
                || time.getIdentificador().equals("")) {
            throw  new RuntimeException("Dados invalidos");
        } else {
            return timeRepository.save(time);
        }
    }

    public List<Time> listarTimes(String estado) {
        if (estado != null) {
            return timeRepository.findByEstado(estado);
        }
        return timeRepository.findAll();
    }

    public Time getTime(Integer id) {
        return timeRepository.getById(id);
    }

}