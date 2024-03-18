package br.insper.loja.compra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping("/compra")
    public ArrayList<Compra> getCompras() {
        return compraService.listarCompras();
    }

    @PostMapping("/compra")
    @ResponseStatus(HttpStatus.CREATED)
    public Compra salvarCompra(@RequestBody Compra compra) {
        return compraService.cadastrarCompra(compra);
    }

}
