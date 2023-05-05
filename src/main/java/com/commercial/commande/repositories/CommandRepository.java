package com.commercial.commande.repositories;


import org.springframework.data.repository.CrudRepository;

import com.commercial.commande.models.entities.Command;

public interface CommandRepository extends CrudRepository<Command, Long> {

}
