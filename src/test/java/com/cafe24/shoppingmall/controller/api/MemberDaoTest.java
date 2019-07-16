package com.cafe24.shoppingmall.controller.api;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cafe24.shoppingmall.config.AppConfig;
import com.cafe24.shoppingmall.config.TestWebConfig;
import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.MemberVO;
import com.cafe24.shoppingmall.repository.MemberDao;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class, TestWebConfig.class })
@WebAppConfiguration
public class MemberDaoTest{

	@Autowired
	private MemberDao memberDao;
	
	private MemberVO memberVO;
	
	@Before
	public void setUp() {
		memberVO = new MemberVO("testID", "이동규", "qwerQ1234!@", "dongkyuo@naver.com", "01073437248", "male",
				"46212", "경기도 성남시 중원구", "상대원 3동 2344 번지 2층");
	}
	
	@Test
	public void testInsert() throws Exception {
		System.out.println(memberDao.insert(memberVO));
		System.out.println(memberVO.getNo());
	}

	@Test
	public void testRead() throws Exception {
		MemberVO memberVO2 = memberDao.read(1L);
		assertThat(memberVO.getId(),is(memberVO2.getId()));
	}

	@Test
	public void testUpdate() throws Exception {
		memberVO.setTelephone("03073437248");
		memberDao.update(memberVO);
	}

	@Test
	public void testDelete() throws Exception {
		memberDao.delete(10L);
	}

	@Test
	public void testGetList() throws Exception {
		System.out.println(memberDao.getList(new Criteria()));
	}

	@Test
	public void testGetTotal() {
		System.out.println(memberDao.getTotal(new Criteria()));
	}
	@Test
	public void testFindById() {
		System.out.println((memberDao.findById("dongkyuo")));
	}
}
