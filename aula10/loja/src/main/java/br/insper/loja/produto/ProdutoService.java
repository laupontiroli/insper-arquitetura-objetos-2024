package br.insper.loja.produto;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProdutoService {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public Produto cadastrarProduto(Produto produto) {

        if (produto.getNome().equals("")) {
            return null;
        } else {
            produtos.add(produto);
            return produto;
        }


    }

    public ArrayList<Produto> listarProdutos(String nome) {
        if (nome != null) {
            ArrayList<Produto> lista = new ArrayList<>();
            for (Produto produto : produtos) {
                if (produto.getNome().startsWith(nome)) {
                    lista.add(produto);
                }
            }
            return lista;
        }
        return produtos;
    }

    public void excluirProduto(String cpf) {
        Produto produtoRemover = null;
        for (Produto produto : produtos) {
            if (cpf.equalsIgnoreCase(produto.getNome())) {
                produtoRemover = produto;
            }
        }
        if (produtoRemover != null) {
            produtos.remove(produtoRemover);
        } else {
            return;
        }
    }

    public Produto getProduto(String cpf) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(cpf)) {
                return produto;
            }
        }
        return null;
    }

}