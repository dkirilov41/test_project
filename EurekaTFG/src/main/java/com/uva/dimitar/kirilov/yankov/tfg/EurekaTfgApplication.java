package com.uva.dimitar.kirilov.yankov.tfg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaTfgApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaTfgApplication.class, args);
	}
}
