package br.com.demoprodutoapi.services.impl;

import br.com.demoprodutoapi.dto.ProdutoDTO;
import br.com.demoprodutoapi.entities.Produto;
import br.com.demoprodutoapi.services.ProdutoService;

import java.util.List;

public class ProdutoServiceImpl implements ProdutoService {
    @Override
    public List<ProdutoDTO> buscarTodos() {
        return null;
    }

    @Override
    public ProdutoDTO salvar(Produto produto) {
        return null;
    }

    @Override
    public void delete(ProdutoDTO produtoDTO, Long id) {

    }
}
