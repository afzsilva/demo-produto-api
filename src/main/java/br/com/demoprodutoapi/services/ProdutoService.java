package br.com.demoprodutoapi.services;

import br.com.demoprodutoapi.dto.ProdutoDTO;
import br.com.demoprodutoapi.entities.Produto;

import java.util.List;

public interface ProdutoService {

    List<ProdutoDTO> buscarTodos();
    ProdutoDTO salvar(Produto produto);
    void delete(ProdutoDTO produtoDTO, Long id);

}
