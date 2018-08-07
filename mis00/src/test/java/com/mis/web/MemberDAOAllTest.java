package com.mis.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.MemberVO;
import com.mis.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOAllTest {

	@Inject
	private MemberDAO dao;
	
	@Test
	public void testUpdateMember() throws Exception {
		
		MemberVO vo = new MemberVO();
		vo.setUserid("user01");
		vo.setUserpw("1234");
		vo.setUsername("±è½ÂÀ¯");
		vo.setEmail("admin@naver.com");
		dao.updateMember(vo);
		
	}

	@Test
	public void testSelectMember() throws Exception {
		
		System.out.println(dao.readMember("user01"));

	}
	
	@Test
	public void testDeleteMember() throws Exception {
		
		dao.deleteMember("user01", "1234");
		
	}
}
