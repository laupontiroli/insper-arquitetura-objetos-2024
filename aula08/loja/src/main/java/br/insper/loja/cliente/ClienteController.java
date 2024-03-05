package br.insper.loja.cliente;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;

@RestController
public class ClienteController {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    @GetMapping("/cliente")
    public ArrayList<Cliente> getClientes(@RequestParam(required = false) String nome) {
        if (nome != null) {
            ArrayList<Cliente> lista = new ArrayList<>();
            for (Cliente cliente : clientes) {
                if (cliente.getNome().startsWith(nome)) {
                    lista.add(cliente);
                }
            }
            return lista;
        }
        return clientes;
    }

    @GetMapping("/cliente/{cpf}")
    public Cliente getCliente(@PathVariable String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    @PostMapping("/cliente")
    public void salvarCliente(@RequestBody Cliente cliente) {
        clientes.add(cliente);
    }

    @DeleteMapping("/cliente/{cpf}")
    public void delete(@PathVariable String cpf) {
        Cliente clienteRemover = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                clienteRemover = cliente;
            }
        }
        if (clienteRemover != null) {
            clientes.remove(clienteRemover);
        }
    }

}
