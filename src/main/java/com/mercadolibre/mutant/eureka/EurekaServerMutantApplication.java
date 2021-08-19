package com.mercadolibre.mutant.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerMutantApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(EurekaServerMutantApplication.class, args);
	}
}
