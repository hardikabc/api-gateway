package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.filters.SimpleFilter;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ApiGatewayApplication {

	public static void main(String[] args) {

		System.out.println("Mukesh Main from local");
		System.out.println("New Logic Data");
		SpringApplication.run(ApiGatewayApplication.class, args);
                System.out.println("1 - Master Code 1 ");
		System.out.println("2 - Master Code 2 ");
		System.out.println("3 - Master code 3  ");

	        System.out.println("4 - Master Code 4 ");
		System.out.println("5 - Master Code 5 ");
		System.out.println("6 - Master code 5  ");
		

		
	}
	
	  @Bean
	  public SimpleFilter simpleFilter() {
	     return new SimpleFilter();
	  }

}
