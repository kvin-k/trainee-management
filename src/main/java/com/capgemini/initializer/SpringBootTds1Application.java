package com.capgemini.initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.capgemini.mycontroller")
@ComponentScan("com.capgemini.dao")
@ComponentScan("com.capgemini.service")
@ComponentScan("com.capgemini.dto")
@EntityScan(basePackages = {"com.capgemini.dto"})
@SpringBootApplication
public class SpringBootTds1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTds1Application.class, args);
	}

}
