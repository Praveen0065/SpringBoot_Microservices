package com.app.repository2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.entity1.Product;

import jakarta.transaction.Transactional;

public interface ProductRepository  extends JpaRepository<Product, Integer>{


}
