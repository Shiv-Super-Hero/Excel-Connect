package com.shivaji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.shivaji.repo")
public class ExcelConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcelConnectApplication.class, args);
	}

}
