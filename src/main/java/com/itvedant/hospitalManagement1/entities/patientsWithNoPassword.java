package com.itvedant.hospitalManagement1.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="NoPassword",types=(patients.class))
public interface patientsWithNoPassword {

    String getFirstname();
    String getLastname();
    String getDisease();
    
}
