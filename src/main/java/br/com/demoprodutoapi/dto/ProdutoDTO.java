package br.com.demoprodutoapi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class ProdutoDTO {

    @Size(max = 255)
    private String nome;

    @Digits(integer = 10, fraction = 2)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal valor;

    @Size(max = 255)
    private String descricao;
}
