package com.itvedant.hospitalManagement1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itvedant.hospitalManagement1.entities.Doctor;

public interface DoctorRepositories extends JpaRepository <Doctor,Integer> {
    
}
