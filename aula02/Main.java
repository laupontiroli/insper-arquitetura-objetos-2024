package org.example;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in); // dasdadas
        System.out.println("Digite o nome:");
        String nome = x.nextLine();
        System.out.println("Olá " + nome);

        int tamanho = nome.length();

        System.out.println(tamanho);

        if (tamanho > 10) {
            System.out.println("Maior que 10");
        } else if (tamanho > 5) {
            System.out.println("Maior que 5");
        } else {
            System.out.println("Maior que 0");
        }

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        for (Integer i : lista) {
            System.out.println(i);
        }

        for (Integer i = 0; i < lista.size(); i++)  {
            Integer num = lista.get(i);
            System.out.println(num);
        }

        lista.add(20);

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);

        for (Integer i : set) {
            System.out.println(i);
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("nome", "Eduardo");
        map.put("idade",  "37");

        for (String chave : map.keySet()) {
            System.out.println(chave);
        }

        for (String valor : map.values()) {
            System.out.println(valor);
        }

        for (String chave : map.keySet()) {
            String valor =  map.get(chave);
            System.out.println(chave + ":"  + valor);
        }

        Filme  filme = new Filme();
        filme.nome = "Senhor dos Aneis";
        filme.ano = 2000;
        filme.atores.add("Ator 1");


    }

}