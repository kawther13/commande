
 
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

import com.commercial.commande.models.entities.Command;
import com.commercial.commande.services.CommandService;


//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")


public class CommandController {

	//autowire the CommandService class  
	@Autowired  
	CommandService as;  

	//creating a get mapping that retrieves all the Command detail from the database   
	@GetMapping("/order")
	private List<Command> getAllCommands()   
	{  
		return as.getAllCommands();  
	}  

	//creating a get mapping that retrieves the detail of a specific order  
	@GetMapping("/order/{id}")  
	private Command getCommand(@PathVariable("id") Long id)   
	{  
		return as.getCommandById(id);  
	}  

	//creating a delete mapping that deletes a specified order  
	@DeleteMapping("/order/{id}")  
	private void deleteCommand(@PathVariable("id") Long id)   
	{  
		as.delete(id);  
	} 

	//create new order
	@PostMapping("/order")  
	private Command saveCommand(@RequestBody Command a)   
	{  
		as.saveOrUpdate(a);  
		return a;  
	} 

	//creating put mapping that updates the order detail
	@PutMapping("/order")  
	private Command update(@RequestBody  Command a)   
	{  
		as.saveOrUpdate(a);  
		return a;  
	}  
}
