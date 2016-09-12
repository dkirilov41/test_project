package com.uva.dimitar.kirilov.yankov.tfg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicioTfg1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioTfg1Application.class, args);
	}
}
