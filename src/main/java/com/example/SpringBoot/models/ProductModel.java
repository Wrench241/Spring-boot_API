package com.example.SpringBoot.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "tb_products")
public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;

    //auto geração de identificadores
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct;
    private String name;
    private BigDecimal value;
}
