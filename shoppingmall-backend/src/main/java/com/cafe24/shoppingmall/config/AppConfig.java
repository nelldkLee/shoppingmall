package com.cafe24.shoppingmall.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.cafe24.shoppingmall.config.app.AppSecurityConfig;
import com.cafe24.shoppingmall.config.app.DBConfig;
import com.cafe24.shoppingmall.config.app.MybatisConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.cafe24.shoppingmall.service", "com.cafe24.shoppingmall.repository", "com.cafe24.shoppingmall.aspect"})
@Import({DBConfig.class, MybatisConfig.class})
public class AppConfig {
}
