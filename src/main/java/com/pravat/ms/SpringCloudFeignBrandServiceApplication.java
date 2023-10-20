package com.pravat.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudFeignBrandServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignBrandServiceApplication.class, args);
	}

}
