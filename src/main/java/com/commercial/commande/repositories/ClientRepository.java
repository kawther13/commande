package com.commercial.commande.repositories;

import org.springframework.data.repository.CrudRepository;

import com.commercial.commande.models.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {

}
