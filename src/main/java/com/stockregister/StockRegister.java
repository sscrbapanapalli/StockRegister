package com.stockregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
 
@SpringBootApplication
public class StockRegister {
 
    public static void main(String[] args) throws Exception {
        SpringApplication.run(StockRegister.class, args);
    }
   /* @Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(StockRegister.class);
	}*/
 
}
