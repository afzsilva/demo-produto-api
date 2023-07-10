package br.com.demoprodutoapi.services.impl;

import br.com.demoprodutoapi.dto.ProdutoDTO;
import br.com.demoprodutoapi.entities.Produto;
import br.com.demoprodutoapi.mapper.impl.dto.ProdutoMapper;
import br.com.demoprodutoapi.repositories.ProdutoRepository;
import br.com.demoprodutoapi.services.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final ProdutoMapper produtoMapper;

    @Override
    public List<ProdutoDTO> buscarTodos() {
        return produtoMapper.entidadesParaDTOs(produtoRepository.findAll());
    }

    @Override
    public ProdutoDTO salvar(ProdutoDTO produtoDTO) {
        Produto produto = produtoMapper.dtoParaEntidade(produtoDTO);
        produto = produtoRepository.save(produto);
        produtoDTO.setId(produto.getId());
        return produtoDTO;
    }

    @Override
    public void delete(Long id) {
       Produto produto = produtoRepository.findById(id).orElseThrow(()-> new RuntimeException("Impossivel remover, Produto não existe"));
       produtoRepository.deleteById(produto.getId());
    }
}
