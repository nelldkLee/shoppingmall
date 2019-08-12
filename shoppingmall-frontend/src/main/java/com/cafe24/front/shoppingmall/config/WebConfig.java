package com.cafe24.front.shoppingmall.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.cafe24.front.shoppingmall.config.web.FileuploadConfig;
import com.cafe24.front.shoppingmall.config.web.MVCConfig;

@Configuration
@ComponentScan({ "com.cafe24.front.shoppingmall.controller" })
@Import({ MVCConfig.class, FileuploadConfig.class })
public class WebConfig {

}
