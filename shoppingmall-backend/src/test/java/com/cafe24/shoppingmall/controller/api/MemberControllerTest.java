package com.cafe24.shoppingmall.controller.api;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cafe24.shoppingmall.config.TestAppConfig;
import com.cafe24.shoppingmall.config.TestWebConfig;
import com.cafe24.shoppingmall.domain.MemberVO;
import com.cafe24.shoppingmall.util.ValidationMessage;
import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestAppConfig.class, TestWebConfig.class })
@WebAppConfiguration
public class MemberControllerTest {
	private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MemberVO memberVO;
    @Before
    public void setUp() {
        Mockito.reset();
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        memberVO = new MemberVO("testID","이동규","qwerQ1234!@","dongkyuo@naver.com","01073437248","male", "46212","경기도 성남시 중원구", "상대원 3동 2344 번지 2층");
    }

    @Test
    public void 테스트_1_회원가입데이터_유효성체크_이메일_패턴() throws Exception {
    	memberVO.setEmail("dongkyuo#naver.com");
        mockMvc.perform(post("/api/member")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(new Gson().toJson(memberVO))
        )
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.result", is("fail")))
                .andExpect(jsonPath("$.data[0].defaultMessage", is(ValidationMessage.EAMAIL_PATTERN)))
                .andExpect(jsonPath("$.data[0].field", is("email")));
    }
    @Test
    public void 테스트_2_회원가입데이터_유효성체크_전화번호_개수부족() throws Exception {
    	memberVO.setTelephone("01078");
        mockMvc.perform(post("/api/member")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(new Gson().toJson(memberVO))
        )
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.result", is("fail")))
                .andExpect(jsonPath("$.data[0].defaultMessage", is(ValidationMessage.TELEPHONE_PATTERN)))
                .andExpect(jsonPath("$.data[0].field", is("telephone")));
    }
    @Test
    public void 테스트_3_회원가입데이터_유효성체크_전화번호_개수초과() throws Exception {
    	memberVO.setTelephone("0107342237248");
        mockMvc.perform(post("/api/member")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(new Gson().toJson(memberVO))
        )
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.result", is("fail")))
                .andExpect(jsonPath("$.data[0].defaultMessage", is(ValidationMessage.TELEPHONE_PATTERN)))
                .andExpect(jsonPath("$.data[0].field", is("telephone")));
    }
    @Test
    public void 테스트_4_회원가입데이터_유효성체크_전화번호_빈칸체크() throws Exception {
    	memberVO.setTelephone("");
        mockMvc.perform(post("/api/member")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(new Gson().toJson(memberVO))
        )
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.result", is("fail")))
                .andExpect(jsonPath("$.data[0].defaultMessage", is(ValidationMessage.TELEPHONE_PATTERN)))
                .andExpect(jsonPath("$.data[0].field", is("telephone")));
    }
    @Test
    public void 테스트_5_회원가입데이터_유효성체크_패스워드_정규식체크() throws Exception {
    	memberVO.setPassword("qwe1234");
        mockMvc.perform(post("/api/member")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(new Gson().toJson(memberVO))
        )
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.result", is("fail")))
                .andExpect(jsonPath("$.data[0].defaultMessage", is(ValidationMessage.PASSWORD_PATTERN)))
                .andExpect(jsonPath("$.data[0].field", is("password")));
    }
    
}
