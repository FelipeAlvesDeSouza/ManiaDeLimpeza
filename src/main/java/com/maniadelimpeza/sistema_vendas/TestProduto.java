package com.maniadelimpeza.sistema_vendas;

import com.maniadelimpeza.sistema_vendas.model.Produto;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

@Component
public class TestProduto implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception
    {
        FileReader file = new FileReader("src/main/java/com/maniadelimpeza/sistema_vendas/files/produto.txt");
        BufferedReader read = new BufferedReader(file);

        String linha = read.readLine();
        String [] campos = null;

        Integer id = 1;

        while(linha != null)
        {
            campos = linha.split(";");

            Produto produto = new Produto();

            produto.setId(id++);
            produto.setName(campos[0]);
            produto.setQuantity(Integer.valueOf(campos[1]));
            produto.setPrice(Double.valueOf(campos[2]));

            System.out.println(produto);

            linha = read.readLine();

        }



        file.close();
    }
}
