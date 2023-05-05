package com.commercial.commande.repositories;



import org.springframework.data.repository.CrudRepository;

import com.commercial.commande.models.entities.Category;



public interface CategoryRepository  extends CrudRepository<Category, Long> {

}
