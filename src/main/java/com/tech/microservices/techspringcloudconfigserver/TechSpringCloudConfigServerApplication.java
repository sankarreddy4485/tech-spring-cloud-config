package com.tech.microservices.techspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class TechSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechSpringCloudConfigServerApplication.class, args);
	}

}
