package com.maniaDeLimpeza.demo.Repository;

import com.maniaDeLimpeza.demo.Model.Products;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

    @Query("SELECT p FROM Products p WHERE p.nameProduct = :name")
    Optional<Products> findByNameProduct(@Param("name") String name);

    @Transactional
    void deleteByNameProduct(String nameProduct);
}
