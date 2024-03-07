package br.insper.loja.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente")
    public ArrayList<Cliente> getClientes(@RequestParam(required = false) String nome) {
        return clienteService.listarClientes(nome);
    }

    @GetMapping("/cliente/{cpf}")
    public Cliente getCliente(@PathVariable String cpf) {
        return clienteService.getCliente(cpf);
    }

    @PostMapping("/cliente")
    public void salvarCliente(@RequestBody Cliente cliente) {
        clienteService.cadastrarCliente(cliente);
    }

    @DeleteMapping("/cliente/{cpf}")
    public void delete(@PathVariable String cpf) {
        clienteService.excluirClientes(cpf);
    }

}
