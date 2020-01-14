package com.indra.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class IndraConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndraConfigServiceApplication.class, args);
	}

}
