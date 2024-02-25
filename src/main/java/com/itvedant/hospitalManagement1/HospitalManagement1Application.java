package com.itvedant.hospitalManagement1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HospitalManagement1Application {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagement1Application.class, args);
	}

}
