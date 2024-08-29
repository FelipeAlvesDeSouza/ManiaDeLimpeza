package com.maniadelimpeza.sistema_vendas.service;

import com.maniadelimpeza.sistema_vendas.model.Produto;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProdutoService
{
    Map<Integer , Produto> mapa = new HashMap<Integer , Produto>();

    public Collection<Produto> obterListaProdutos()
    {
        return mapa.values();
    }

}
