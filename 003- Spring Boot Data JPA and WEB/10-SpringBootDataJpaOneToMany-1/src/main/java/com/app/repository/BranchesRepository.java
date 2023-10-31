package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Branches;

public interface BranchesRepository extends JpaRepository<Branches, Integer> {

}
