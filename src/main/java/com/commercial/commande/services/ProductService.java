package com.commercial.commande.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.commercial.commande.models.entities.Product;
import com.commercial.commande.repositories.ProductRepository;

import java.util.ArrayList;  
import java.util.List;  
  
import org.springframework.stereotype.Service;
@Service
public class ProductService {
	@Autowired  
	ProductRepository aR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Product> getAllProducts()   
	{  
		List<Product> products = new ArrayList<Product>();  
		aR.findAll().forEach(a -> products.add(a));  
		return products;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Product getproductById(Long id)   
	{  
		return aR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Product product)   
	{  
		aR.save(product);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(Long id)   
	{  
		aR.deleteById(id);  
	} 
}
