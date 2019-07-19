package com.cafe24.config.app;


import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.cafe24.shoppingmall.mapper"})
public class MybatisConfig {
	
	@Bean
	public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource, ApplicationContext applicationContext) throws Exception {
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		sessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:com/cafe24/shoppingmall/configuration.xml") );
		return sessionFactoryBean.getObject();
	}
	
	@Bean
	public SqlSession sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
