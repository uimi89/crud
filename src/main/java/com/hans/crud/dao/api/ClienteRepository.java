package com.hans.crud.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hans.crud.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente,Integer> {

}
