package com.app.repository2;

import org.springframework.data.repository.CrudRepository;

import com.app.entity1.Product;

public interface ProductRepository  extends CrudRepository<Product, Integer>{

}
