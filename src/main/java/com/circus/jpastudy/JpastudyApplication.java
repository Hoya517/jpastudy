package com.circus.jpastudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //JPA Auditing
@SpringBootApplication
public class JpastudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpastudyApplication.class, args);
	}

}
