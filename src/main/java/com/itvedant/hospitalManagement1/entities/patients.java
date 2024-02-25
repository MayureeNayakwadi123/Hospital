package com.itvedant.hospitalManagement1.entities;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)

public class patients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;

    @NotNull(message = "first name cannot be null")
    private String firstname;
    
    @NotEmpty(message = "last name cannot be empty")
    private String lastname;

    private String email;

    @Column(unique = true)
    @Size(min=10, message = "mobile number should have 10 numbers only")
    private String mobile;

    @Size(min=4, message = "password should have minimum 4 characters")
    private String password;
    private String confirmpassword;
    private String disease;

    @CreatedDate
    private Instant createdDate;

    @LastModifiedDate
    private Date modifiedAt;

    //    owing table
@OneToOne
@JoinColumn(name = "doctor_id")
private Doctor doctor1;

// Many to many
@ManyToMany(mappedBy="patient1")
  private List<Doctor>doctor;


    

}
