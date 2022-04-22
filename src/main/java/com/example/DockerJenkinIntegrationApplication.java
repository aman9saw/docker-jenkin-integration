package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinIntegrationApplication {

	static Logger log = LoggerFactory.getLogger(DockerJenkinIntegrationApplication.class);
	
	public void init() {
		log.info("Application started ........................");
	}
	
	public static void main(String[] args) {
		log.info("Application executed ........................");
		SpringApplication.run(DockerJenkinIntegrationApplication.class, args);
	}

}
