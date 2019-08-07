package com.cafe24.shoppingmall.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.cafe24.config.app.AppSecurityConfig;
import com.cafe24.config.app.DBConfig;
import com.cafe24.config.app.MybatisConfig;
import com.cafe24.config.app.OAuth2ServerConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.cafe24.shoppingmall.service", "com.cafe24.shoppingmall.repository", "com.cafe24.shoppingmall.aspect"})
@Import({AppSecurityConfig.class, DBConfig.class, MybatisConfig.class, OAuth2ServerConfig.class})
public class AppConfig {
}
