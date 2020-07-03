package com.projet_S2.remarque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
public class EtudientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtudientApplication.class, args);
	}

}
