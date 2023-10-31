package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Model1;

public interface ModelRepository extends JpaRepository<Model1, Integer> {

}
