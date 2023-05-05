package com.commercial.commande.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"name"})
@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private float tax;

    @Column
    private BigDecimal price;

    @Column(name= "units_in_stock")
    private int unitsInStock;

    
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName="id")
    private Category category;






}
