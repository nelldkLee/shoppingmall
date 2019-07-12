package com.cafe24.shoppingmall.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.cafe24.config.web.MVCConfig;
import com.cafe24.config.web.SwaggerConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.cafe24.shoppingmall.controller", "com.cafe24.shoppingmall.api.controller", "com.cafe24.shoppingmall.exception"})
//@Import({SecurityConfig.class, FileuploadConfig.class, MVCConfig.class, MessageConfig.class})
@Import({MVCConfig.class, SwaggerConfig.class})
public class WebConfig {
}
