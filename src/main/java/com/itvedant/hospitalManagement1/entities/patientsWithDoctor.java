package com.itvedant.hospitalManagement1.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="DocWithPatients",types = {Doctor.class,patients.class})
public interface patientsWithDoctor {

    String getFirstname();
    patients getPatient();
    

    
}
