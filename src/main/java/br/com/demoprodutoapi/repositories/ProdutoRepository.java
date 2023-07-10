package br.com.demoprodutoapi.repositories;

import br.com.demoprodutoapi.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
