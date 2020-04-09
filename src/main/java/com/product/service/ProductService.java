package com.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.exception.RecordNotFoundException;
import com.product.model.ProductEntity;
import com.product.repository.ProductRepository;

 
@Service
public class ProductService {
     
    @Autowired
    ProductRepository repository;
     
    public List<ProductEntity> getAllProducts()
    {
        List<ProductEntity> ProductList = repository.findAll();
         
        if(ProductList.size() > 0) {
            return ProductList;
        } else {
            return new ArrayList<ProductEntity>();
        }
    }
  
}