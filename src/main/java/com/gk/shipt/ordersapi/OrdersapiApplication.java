package com.gk.shipt.ordersapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.gk.shipt.ordersapi.config.SwaggerConfig;
import com.gk.shipt.ordersapi.config.WebConfig;

@SpringBootApplication
@EnableAutoConfiguration
@Import({WebConfig.class,SwaggerConfig.class})
@ComponentScan("com.gk.shipt.ordersapi.controller")
@ComponentScan("com.gk.shipt.ordersapi.entity")
@ComponentScan("com.gk.shipt.ordersapi.repository")
@ComponentScan("com.gk.shipt.ordersapi.service")
@ComponentScan("com.gk.shipt.ordersapi.config")
public class OrdersapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdersapiApplication.class, args);
	}

}

