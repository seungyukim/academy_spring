package com.mis.web;

import javax.inject.Inject;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.BoardVO;
import com.mis.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOTest {

	@Inject
	private BoardDAO dao;
	
	private static Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Test
	public void test01Create() throws Exception {
		BoardVO board = new BoardVO();
		board.setTitle("새로운 글을 넣습니다.");
		board.setContent("새로운 글을 넣습니다.");
		board.setWriter("user00");
		logger.debug("TEST : " + board);
		dao.create(board);
		
	}
	
	@Test
	public void test02Read() throws Exception {
		logger.info(dao.read(1).toString());
	}
	
	@Test
	public void test03Update() throws Exception {
		BoardVO board = new BoardVO();
		board.setBno(2);
		board.setTitle("수정된 글입니다");
		board.setContent("수정 테스트");
		board.setWriter("김승유");
		logger.debug("TEST : " + board);
		dao.update(board);
		
	}
	
	@Test
	public void test04Delete() throws Exception {
		dao.delete(2);
	}
	
}





















