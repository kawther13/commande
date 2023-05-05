package com.commercial.commande.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.commercial.commande.models.entities.OrderLine;
import com.commercial.commande.services.OrderLineService;


//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class OrderLineController {

	//autowire the OrderLineService class  
	@Autowired  
	OrderLineService as;  

	//creating a get mapping that retrieves all the OrderLine detail from the database   
	@GetMapping("/orderLine")
	private List<OrderLine> getAllOrderLines()   
	{  
		return as.getAllOrderLines();  
	}  

	//creating a get mapping that retrieves the detail of a specific orderLine  
	@GetMapping("/orderLine/{id}")  
	private OrderLine getOrderLine(@PathVariable("id") Long id)   
	{  
		return as.getorderLineById(id);  
	}  

	//creating a delete mapping that deletes a specified orderLine  
	@DeleteMapping("/orderLine/{id}")  
	private void deleteOrderLine(@PathVariable("id") Long id)   
	{  
		as.delete(id);  
	} 

	//create new orderLine
	@PostMapping("/orderLine")  
	private OrderLine saveOrderLine(@RequestBody OrderLine a)   
	{  
		as.saveOrUpdate(a);  
		return a;  
	} 

	//creating put mapping that updates the orderLine detail
	@PutMapping("/orderLine")  
	private OrderLine update(@RequestBody  OrderLine a)   
	{  
		as.saveOrUpdate(a);  
		return a;  
	}  
}
