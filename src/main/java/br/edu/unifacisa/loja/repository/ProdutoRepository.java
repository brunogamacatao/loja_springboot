package br.edu.unifacisa.loja.repository;

import br.edu.unifacisa.loja.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
