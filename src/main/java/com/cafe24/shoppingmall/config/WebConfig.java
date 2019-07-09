package com.cafe24.shoppingmall.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.cafe24.config.web.MVCConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.cafe24.shoppingmall.controller"})
//@Import({SecurityConfig.class, FileuploadConfig.class, MVCConfig.class, MessageConfig.class})
@Import({MVCConfig.class})
public class WebConfig {
}
