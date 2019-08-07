package com.cafe24.front.shoppingmall.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.cafe24.front.config.app.AppSecurityConfig;
import com.cafe24.front.config.app.OAuth2ClientConfig;

@Configuration
@ComponentScan({"com.cafe24.front.shoppingmall.service", "com.cafe24.front.shoppingmall.security"})
@Import({AppSecurityConfig.class, OAuth2ClientConfig.class})
public class AppConfig {
	/*
	 * public RestTemplate restTemplate() { HttpComponentsClientHttpRequestFactory
	 * factory = new HttpComponentsClientHttpRequestFactory();
	 * factory.setReadTimeout(5000); RestTemplate restTemplate = new
	 * RestTemplate(factory); return restTemplate; }
	 */
}
