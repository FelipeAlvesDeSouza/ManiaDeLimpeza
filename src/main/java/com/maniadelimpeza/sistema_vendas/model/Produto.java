package com.maniadelimpeza.sistema_vendas.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
public class Produto {
    private Integer id;
    private String name;
    private Integer quantity;
    private Double price;
    private List<Produto> products;

    @Override
    public String toString() {
        return "Produtos{ " +
                "id = " + id +
                "\nnome = " + name +
                "\nQuantidade = " + quantity +
                "\nPreço = " + price +
                " }" +
                "\n* -------------------------------- *";
    }
}
