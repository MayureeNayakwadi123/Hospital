package com.itvedant.hospitalManagement1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itvedant.hospitalManagement1.entities.patients;

public interface patientsRepositories extends JpaRepository<patients,Integer>{
    
}
