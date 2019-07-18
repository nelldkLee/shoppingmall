package com.cafe24.shoppingmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.cafe24.config.app.DBConfig;
import com.cafe24.config.app.MybatisConfig;

@Configuration
@EnableAspectJAutoProxy
@MapperScan({"com.cafe24.shoppingmall.mapper"})
@Import({DBConfig.class, MybatisConfig.class})
public class TestAppConfig {
}
