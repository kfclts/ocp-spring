package com.kfc.ocpdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class OcpdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcpdemoApplication.class, args);
	}

}
