package br.insper.loja.compra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    public Compra salvarCompra(@RequestBody Compra compra) {
        return compraService.cadastrarCompra(compra);
    }

}
