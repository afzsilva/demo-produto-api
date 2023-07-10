package br.com.demoprodutoapi.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;


@Entity
@Data
public class Produto {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column(precision = 10, scale = 2)
    private BigDecimal valor;

    @Column
    private String descricao;

}
