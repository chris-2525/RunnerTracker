package com.example.demo;

import org.springframework.boot.SpringApplication;

public class TestRunnerzApplication {

	public static void main(String[] args) {
		SpringApplication.from(RunnerzApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
