package com.cafe24.shoppingmall.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cafe24.shoppingmall.config.TestAppConfig;
import com.cafe24.shoppingmall.mapper.TimeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestAppConfig.class})
public class TimeMapperTest {

	@Autowired
	TimeMapper timeMapper;

	/*
	 * @Test public void test() { System.out.println(timeMapper.getTime()); }
	 */
	@Test
	public void test2() {
		System.out.println(timeMapper.getTime2());
	}
	
	
}
