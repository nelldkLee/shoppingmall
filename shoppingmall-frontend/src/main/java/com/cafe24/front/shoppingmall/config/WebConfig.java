package com.cafe24.front.shoppingmall.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.cafe24.front.shoppingmall.config.web.MVCConfig;

@Configuration
@ComponentScan({ "com.cafe24.front.shoppingmall.controller" })
@Import({ MVCConfig.class })
public class WebConfig {

}
