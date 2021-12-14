package com.uptc.cursesmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.uptc.commons.students.entities", "com.uptc.cursesmicroservice.entities"})
public class CoursesMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesMicroserviceApplication.class, args);
	}

}
