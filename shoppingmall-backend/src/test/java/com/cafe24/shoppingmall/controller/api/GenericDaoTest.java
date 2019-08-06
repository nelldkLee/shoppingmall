package com.cafe24.shoppingmall.controller.api;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cafe24.shoppingmall.config.TestAppConfig;
import com.cafe24.shoppingmall.config.TestWebConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestAppConfig.class, TestWebConfig.class })
@WebAppConfiguration
public abstract class GenericDaoTest<T> {
	
	@Autowired
	protected T target;
	
	protected Connection con;
	
	@Before
	public abstract void before() throws SQLException;
	
	@After
	public abstract void after() throws SQLException;
		
}
