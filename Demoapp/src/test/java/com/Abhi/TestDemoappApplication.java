package com.Abhi;

import org.springframework.boot.SpringApplication;

public class TestDemoappApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoappApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
