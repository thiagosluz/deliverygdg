package com.deliverygdg.AppDelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppDeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppDeliveryApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(
		@RequestParam(value = "name", defaultValue = "World") String name
	){
		if (name.toLowerCase().equals("thiago")){
			return "Voce de novo";
		}else{
			return "Hello " + name;
		}
		
	}

}
