package br.edu.unifacisa.loja.controller;

import br.edu.unifacisa.loja.model.Produto;
import br.edu.unifacisa.loja.repository.ProdutoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LojaController {
    private ProdutoRepository repository;

    public LojaController(ProdutoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/hello")
    public String listarProdutos(Model model) {
        model.addAttribute("produto", new Produto());
        model.addAttribute("produtos", repository.findAll());
        return "hello";
    }

    @PostMapping("/hello")
    public String novoProduto(@ModelAttribute Produto produto, Model model) {
        repository.save(produto);
        return listarProdutos(model);
    }
}
