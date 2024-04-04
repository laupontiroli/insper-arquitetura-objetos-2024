package br.insper.loja.partida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PartidaController {

    @Autowired
    private PartidaService partidaService;

    @GetMapping("/partida")
    public ArrayList<Partida> getPartida(@RequestParam(required = false) String mandante) {
        return partidaService.listarPartidas(mandante);
    }

    @PostMapping("/partida")
    @ResponseStatus(HttpStatus.CREATED)
    public Partida salvarPartida(@RequestBody Partida compra) {
        return partidaService.cadastrarPartida(compra);
    }

}
