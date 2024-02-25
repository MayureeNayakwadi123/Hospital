package com.itvedant.hospitalManagement1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itvedant.hospitalManagement1.entities.Staff;

public interface StaffRepositories extends JpaRepository<Staff,Integer>{
    
}
