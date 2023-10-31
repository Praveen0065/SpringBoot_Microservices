package com.app.respository2;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity1.StockInfo;

public interface StockRepo extends JpaRepository<StockInfo, Integer> {

}
