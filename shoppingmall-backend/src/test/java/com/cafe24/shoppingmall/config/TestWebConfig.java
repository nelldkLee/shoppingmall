package com.cafe24.shoppingmall.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.cafe24.config.web.TestMVCConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.cafe24.shoppingmall.controller", "com.cafe24.shoppingmall.api.controller", "com.cafe24.shoppingmall.exception"})
@Import({TestMVCConfig.class })
public class TestWebConfig {
}
