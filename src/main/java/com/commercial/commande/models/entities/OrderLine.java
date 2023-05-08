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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getOrderSum() {
		return orderSum;
	}

	public void setOrderSum(Long orderSum) {
		this.orderSum = orderSum;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}


}
