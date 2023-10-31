package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Vendor;

public interface VendorRepository  extends JpaRepository<Vendor, Integer>{

}
