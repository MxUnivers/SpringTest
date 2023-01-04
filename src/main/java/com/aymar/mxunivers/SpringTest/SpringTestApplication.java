package com.aymar.mxunivers.SpringTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpringTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}

}
