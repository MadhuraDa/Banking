package com.bankingbackend.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.bankingbackend.banking")
public class BankingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingBackendApplication.class, args);
	}

}
