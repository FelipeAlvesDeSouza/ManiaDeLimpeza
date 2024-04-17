package com.maniaDeLimpeza.demo.Controller;

import com.maniaDeLimpeza.demo.Model.Products;
import com.maniaDeLimpeza.demo.Service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
    private final ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Products> listProducts()
    {
        return productService.getAllProducts();
    }

    @PostMapping()
    public ResponseEntity<Products> addProduct (@Valid @RequestBody Products product)
    {
        Products newProducts = productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProducts);
    }


    @PutMapping("/{nameProduct}")
    public ResponseEntity<Products> update (@PathVariable String nameProduct, @RequestBody Products products)
    {

        Products updateProducts = productService.updateProduct(nameProduct,products);
        return ResponseEntity.ok(updateProducts);
    }


    @DeleteMapping("/{nameProduct}")
    public ResponseEntity<Void> delete (@PathVariable String nameProduct)
    {
        productService.deleteProductByName(nameProduct);
        return ResponseEntity.noContent().build();
    }


}
