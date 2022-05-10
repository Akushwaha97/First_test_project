package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(VaultConfig.class)
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		VaultConfig vaultConfig = 	context.getBean(VaultConfig.class);
		System.out.println(vaultConfig.getPassword());
		System.out.println(vaultConfig.getUserName());
	}

}
