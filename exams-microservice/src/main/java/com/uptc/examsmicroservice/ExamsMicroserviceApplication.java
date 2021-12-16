package com.uptc.examsmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ExamsMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamsMicroserviceApplication.class, args);
	}
}