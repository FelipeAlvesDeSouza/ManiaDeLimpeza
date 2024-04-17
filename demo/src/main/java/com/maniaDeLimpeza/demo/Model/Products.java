package com.maniaDeLimpeza.demo.Model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Entity
@Getter
@Setter

public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name="product")
    private String nameProduct;

    @NotNull
    @Column(name="quantity")
    private Integer quantityProduct;

    @NotNull
    @Column(name="price")
    private BigDecimal priceProduct;


}
