package com.app.repository2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.entity1.Product;

import jakarta.transaction.Transactional;

public interface ProductRepository  extends JpaRepository<Product, Integer>{
	
	@Transactional // we need to define on top of the service layer
	@Modifying
	@Query("UPDATE Product SET prodName =:pn WHERE proId=:pid")
	int updateNameById(String pn, Integer pid);

	
	@Transactional // we need to define on top of the service layer
	@Modifying
	@Query("DELETE Product WHERE proId=:pid")
	int removeById(Integer pid);
	

}
