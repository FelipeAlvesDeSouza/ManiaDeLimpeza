package com.maniadelimpeza.sistema_vendas.controller;

import com.maniadelimpeza.sistema_vendas.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProdutoController
{
    @Autowired
    ProdutoService produtoService;


}
