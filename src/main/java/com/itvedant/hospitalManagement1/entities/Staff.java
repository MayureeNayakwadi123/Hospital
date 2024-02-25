package com.itvedant.hospitalManagement1.entities;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)

public class Staff {

      @Id
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty(message = "first name cannot be empty")
    @NotNull(message = "fist name can not be null")
    private String firstname;
    private String mobile;
    private String email;

    @NotEmpty(message = "speciality of doc cannot be empty")
    private String designation;

    
}
