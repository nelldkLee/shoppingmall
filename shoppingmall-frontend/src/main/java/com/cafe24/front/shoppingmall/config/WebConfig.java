package com.cafe24.front.shoppingmall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.cafe24.front.config.web.MVCConfig;

@Configuration
@ComponentScan({ "com.cafe24.front.shoppingmall.controller" })
@Import({ MVCConfig.class })
public class WebConfig {

}
