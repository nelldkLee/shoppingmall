package com.cafe24.config.app;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cafe24.shoppingmall.config.TestAppConfig;
import com.cafe24.shoppingmall.config.WebConfig;
import com.cafe24.shoppingmall.config.app.DBConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DBConfig.class})
public class DataSourceTest {

	@Autowired
	private DataSource ds;
	
	@Test
	public void test() throws SQLException {
		System.out.println(ds.getConnection());
	}

}
