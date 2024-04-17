package com.maniaDeLimpeza.demo.Service;

import com.maniaDeLimpeza.demo.Model.Products;
import com.maniaDeLimpeza.demo.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductsRepository productsRepository;

    @Autowired
    public ProductService(ProductsRepository productsRepository)
    {
        this.productsRepository = productsRepository;
    }

    public List<Products> getAllProducts()
    {
        return productsRepository.findAll();
    }

    public Products addProduct(Products products)
    {
        return productsRepository.save(products);
    }

    public Products updateProduct(String nameProduct, Products products)
    {
        Optional<Products> optionalProduct = productsRepository.findByNameProduct(nameProduct);

        if (optionalProduct.isEmpty()) {
            throw new RuntimeException("Product not found");
        }

        Products existingProduct = optionalProduct.get();


        existingProduct.setQuantityProduct(products.getQuantityProduct());

        return productsRepository.save(existingProduct);
    }
    public void deleteProductByName(String nameProduct)
    {
        productsRepository.deleteByNameProduct(nameProduct);
    }

}
