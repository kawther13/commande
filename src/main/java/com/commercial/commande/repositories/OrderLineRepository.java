package com.commercial.commande.repositories;



import org.springframework.data.repository.CrudRepository;

import com.commercial.commande.models.entities.OrderLine;


public interface OrderLineRepository extends CrudRepository<OrderLine, Long> {
}
