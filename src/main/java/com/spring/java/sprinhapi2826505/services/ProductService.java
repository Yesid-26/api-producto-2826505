package com.spring.java.sprinhapi2826505.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java .util.List;

import com.spring.java.sprinhapi2826505.repositories.ProductRepository;
import com.spring.java.sprinhapi2826505.entities.Product;

@Service
public class ProductService  {

    //crear metodos para la CRUD
    //que estan en el repositorio
    @Autowired 
    private ProductRepository repository; 

    //metodos
    //Read 
    List <Product> findAll(){
        return (List<Product>) repository.findAll();
    }

}
