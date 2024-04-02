package br.insper.loja.cliente;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

@Service
public class ClienteService {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public Cliente cadastrarCliente(Cliente cliente) {


        if (cliente.getNome().equals("")
                || cliente.getCpf().equals("")) {
            throw  new RuntimeException("Dados invalidos");
        } else {
            clientes.add(cliente);
            return cliente;
        }

    }

    public ArrayList<Cliente> listarClientes(String nome) {
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

    public void excluirClientes(String cpf) {
        Cliente clienteRemover = null;
        for (Cliente cliente : clientes) {
            if (cpf.equalsIgnoreCase(cliente.getCpf())) {
                clienteRemover = cliente;
            }
        }
        if (clienteRemover != null) {
            clientes.remove(clienteRemover);
        } else {
            return;
        }
    }

    public Cliente getCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

}