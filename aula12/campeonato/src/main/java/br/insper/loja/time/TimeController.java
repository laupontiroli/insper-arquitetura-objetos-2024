package br.insper.loja.time;

import br.insper.loja.compra.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TimeController {

    @Autowired
    private TimeService timeService;

    @Autowired
    private PartidaService partidaService;

    @GetMapping("/time")
    public List<Time> getTimes(@RequestParam(required = false) String estado) {
        return timeService.listarTimes(estado);
    }

    @GetMapping("/time/{identificador}")
    public Time getTime(@PathVariable String identificador) {
        return timeService.getTime(identificador);
    }


    @GetMapping("/time/{identificador}/vitorias")
    public Integer getVitorias(@PathVariable String identificador) {
        return timeService.getTimeVitorias(identificador);
    }

    @PostMapping("/time")
    public Time salvarTime(@RequestBody Time cliente) {
        return timeService.cadastrarTime(cliente);
    }


}
