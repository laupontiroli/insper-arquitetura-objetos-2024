package br.insper.loja.compra;

import br.insper.loja.cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

    @Autowired
    private ClienteService clienteService;
}
