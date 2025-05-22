package com.iron.grades_data_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GradesDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradesDataServiceApplication.class, args);
	}

}
