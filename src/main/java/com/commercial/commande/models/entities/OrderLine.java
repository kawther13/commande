package com.commercial.commande.models.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.commercial.commande.models.entities.Product;
import com.commercial.commande.models.entities.Command;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_number")
    private Long orderNumber;

    @Column(name = "order_sum")
    private Long orderSum;

    
    @OneToOne(optional=false)
    @JoinColumn(name = "product_id", referencedColumnName="id")
    private Product product;
    
    @ManyToOne(optional=false) //champ obligatoire
	@JoinColumn(name="order_id", referencedColumnName="id")
    private Command command;


}
