package com.cafe24.front.shoppingmall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.cafe24.front.shoppingmall.config.web.SecurityConfig;

@Configuration
@ComponentScan({ "com.cafe24.front.shoppingmall.service", "com.cafe24.front.shoppingmall.security" })
@Import({ SecurityConfig.class })
public class AppConfig {
	
	@Bean
	public RestTemplate restTemplate() {
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		factory.setReadTimeout(5000);
		RestTemplate restTemplate = new RestTemplate(factory);
		return restTemplate;
	}

}
