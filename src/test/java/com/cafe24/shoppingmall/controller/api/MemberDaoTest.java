package com.cafe24.shoppingmall.controller.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cafe24.shoppingmall.config.AppConfig;
import com.cafe24.shoppingmall.config.TestWebConfig;
import com.cafe24.shoppingmall.domain.MemberVO;
import com.cafe24.shoppingmall.repository.MemberDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class, TestWebConfig.class })
@WebAppConfiguration
public class MemberDaoTest {
	
	@Autowired
	private MemberDao memberDao;
	
	@Test
	public void test_1_insert() throws Exception {
		MemberVO memberVO = new MemberVO("testID","이동규","qwerQ1234!@","dongkyuo@naver.com","01073437248","male","46212","경기도 성남시 중원구", "상대원 3동 2344 번지 2층");
		memberDao.insert(memberVO);
	}
}
