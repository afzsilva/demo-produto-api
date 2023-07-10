package br.com.demoprodutoapi.mapper.impl.dto;

import br.com.demoprodutoapi.dto.ProdutoDTO;
import br.com.demoprodutoapi.entities.Produto;
import br.com.demoprodutoapi.mapper.AbstractMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;

@AllArgsConstructor
@Component
public class ProdutoMapper implements AbstractMapper<Produto, ProdutoDTO> {

    @Override
    public ProdutoDTO entidadeParaDTO(Produto entidade) {
        return Objects.isNull(entidade) ? null : ProdutoDTO.builder()
                .id(entidade.getId())
                .nome(entidade.getNome())
                .valor(entidade.getValor())
                .descricao(entidade.getDescricao())
                .build();
    }

    @Override
    public Produto dtoParaEntidade(ProdutoDTO produtoDTO) {
        return Objects.isNull(produtoDTO)? null : Produto.builder()
                .id(produtoDTO.getId())
                .nome(produtoDTO.getNome())
                .valor(produtoDTO.getValor())
                .descricao(produtoDTO.getDescricao())
                .build();
    }
}
