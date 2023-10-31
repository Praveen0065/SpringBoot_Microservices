package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Role;

public interface Rolerepository extends JpaRepository<Role, Integer> {

}
