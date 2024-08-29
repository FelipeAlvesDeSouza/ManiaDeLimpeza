package com.maniadelimpeza.sistema_vendas.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Produto {
    private String name;
    private Integer quantity;
    private Double price;
    private List<Produto> products;
}
