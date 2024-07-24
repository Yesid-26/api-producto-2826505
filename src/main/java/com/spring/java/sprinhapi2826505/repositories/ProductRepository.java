package com.spring.java.sprinhapi2826505.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.java.sprinhapi2826505.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product , Long>{
    //Repositorio por cada entidad
    

}
