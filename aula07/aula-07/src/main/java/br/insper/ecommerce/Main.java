package br.insper.ecommerce;

import br.insper.ecommerce.cliente.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();
        String opcao = "0";
        
        while(!opcao.equalsIgnoreCase("4")) {

            System.out.println("""
                    1 - Cadastrar Cliente
                    2 - Listar Clientes
                    3 - Excluir Cliente
                    4 - Sair
                    """);
            opcao = scanner.nextLine();
            if (opcao.equalsIgnoreCase("1")) {

                System.out.println("Digite o nome do cliente:");
                String nome = scanner.nextLine();
                System.out.println("Digite o CPF do cliente;");
                String cpf = scanner.nextLine();

                if (nome.equals("") || cpf.equals("")) {
                    System.out.println("Dados do cliente invalido.");
                } else {
                    Cliente cliente = new Cliente(nome, cpf, null);
                    clientes.add(cliente);
                    System.out.println("Cliente cadastrado com sucesso.");
                }

            }

            if (opcao.equalsIgnoreCase("2")) {

                System.out.println("Lista de clientes:");
                for (Cliente cliente : clientes) {
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCpf());
                }


            }

            if (opcao.equalsIgnoreCase("3")) {

                System.out.println("Digite o nome do cliente para deletar:");
                String cpf = scanner.nextLine();
                Cliente clienteRemover = null;
                for (Cliente cliente : clientes) {
                    if (cpf.equalsIgnoreCase(cliente.getCpf())) {
                        clienteRemover = cliente;
                    }
                }
                if (clienteRemover != null) {
                    System.out.println("Cliente removido com sucesso");
                    clientes.remove(clienteRemover);
                } else {

                    System.out.println("Cliente não encontrado");
                }


            }

        }


    }

}