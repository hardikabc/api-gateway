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
	}
	
	  @Bean
	  public SimpleFilter simpleFilter() {
	     return new SimpleFilter();
	  }

}
