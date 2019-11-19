package com.exampl.reactservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import javax.servlet.Filter;

@SpringBootApplication
public class ReactServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactServiceApplication.class, args);
	}
	
	@Bean
	public Filter getCORSFilter() {
		return new CORSFilter();
	}

}
