package com.maniadelimpeza.sistema_vendas.controller;

import com.maniadelimpeza.sistema_vendas.model.Produto;
import com.maniadelimpeza.sistema_vendas.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController

public class ProdutoController
{
    @Autowired
    ProdutoService produtoService;

    @GetMapping(value = "produtos")
    public Collection<Produto> obterListaProdutos()
    {
        return produtoService.obterListaProdutos();
    }


}
