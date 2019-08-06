package com.cafe24.front.shoppingmall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan({"com.cafe24.front.shoppingmall.service"})
public class AppConfig {

	@Bean
	public RestTemplate restTemplate() {
		System.out.println("빈 생성이 안되나??? 앞");
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		factory.setReadTimeout(5000); 

		RestTemplate restTemplate = new RestTemplate(factory);
		System.out.println("빈 생성이 안되나???");
		return restTemplate;
	}
}
