package com.i2i.cloudserver.spring_config_cloud_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigCloudServerApplication.class, args);
	}

}
