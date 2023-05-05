
 
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

import com.commercial.commande.models.entities.Product;
import com.commercial.commande.services.ProductService;






//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")


public class ProductController {

	//autowire the ProductService class  
	@Autowired  
	ProductService as;  

	//creating a get mapping that retrieves all the Product detail from the database   
	@GetMapping("/product")
	private List<Product> getAllProducts()   
	{  
		return as.getAllProducts();  
	}  

	//creating a get mapping that retrieves the detail of a specific product  
	@GetMapping("/product/{id}")  
	private Product getProduct(@PathVariable("id") Long id)   
	{  
		return as.getproductById(id);  
	}  

	//creating a delete mapping that deletes a specified product  
	@DeleteMapping("/product/{id}")  
	private void deleteProduct(@PathVariable("id") Long id)   
	{  
		as.delete(id);  
	} 

	//create new product
	@PostMapping("/product")  
	private Product saveProduct(@RequestBody Product a)   
	{  
		as.saveOrUpdate(a);  
		return a;  
	} 

	//creating put mapping that updates the product detail
	@PutMapping("/product")  
	private Product update(@RequestBody  Product a)   
	{  
		as.saveOrUpdate(a);  
		return a;  
	}  
}
