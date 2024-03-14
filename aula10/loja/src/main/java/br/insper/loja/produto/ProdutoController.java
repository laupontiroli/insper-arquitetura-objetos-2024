package br.insper.loja.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/produto")
    public ArrayList<Produto> getProdutos(@RequestParam(required = false) String nome) {
        return produtoService.listarProdutos(nome);
    }

    @GetMapping("/produto/{nome}")
    public Produto getProduto(@PathVariable String nome) {
        return produtoService.getProduto(nome);
    }

    @PostMapping("/produto")
    public Produto salvarProduto(@RequestBody Produto produto) {
        return produtoService.cadastrarProduto(produto);
    }

    @DeleteMapping("/produto/{nome}")
    public void delete(@PathVariable String nome) {
        produtoService.excluirProduto(nome);
    }

}
