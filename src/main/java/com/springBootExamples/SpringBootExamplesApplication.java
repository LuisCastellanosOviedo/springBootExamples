package com.springBootExamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class SpringBootExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExamplesApplication.class, args);
	}

}
