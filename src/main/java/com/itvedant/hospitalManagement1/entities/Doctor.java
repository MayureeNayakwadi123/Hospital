package com.itvedant.hospitalManagement1.entities;

import java.util.List;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Doctor {
    @Id
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty(message = "first name cannot be empty")
    @NotNull(message = "fist name can not be null")
    private String firstname;

    @NotEmpty(message = "first name cannot be empty")
    @NotNull(message = "fist name can not be null")
    private String lastname;
    private String mobile;
    private String email;

    @NotEmpty(message = "speciality of doc cannot be empty")
    private String speciality;

    // onetoone 
@OneToOne(mappedBy = "doctor1")
private patients patient;

// Many to many
@ManyToMany
    @JoinTable(
      name="doc_patients",
      joinColumns=@JoinColumn(name="doc_id" ,referencedColumnName="id"),
      inverseJoinColumns=@JoinColumn(name="patient_id" ,referencedColumnName="id")
    )
    private List<patients>patient1;
 

}
