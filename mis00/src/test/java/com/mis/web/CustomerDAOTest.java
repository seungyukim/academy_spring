package com.mis.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.CustomerVO;
import com.mis.persistence.CustomerDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class CustomerDAOTest {

	@Inject
	private CustomerDAO dao;
	
	@Test
	public void testInsertCustomer() throws Exception {
		
		CustomerVO vo = new CustomerVO();
		vo.setUserid("cust01");
		vo.setName("��1");
		vo.setBirthyear(2018);
		vo.setAddress("������");
		vo.setPhone("010-1234-5678");
		vo.setGrade("SILVER");
		
		dao.insertCustomer(vo);
	}
	
	@Test
	public void testUpdateCustomer() throws Exception {
		
		CustomerVO vo = new CustomerVO();
		vo.setUserid("cust01");
		vo.setName("�����");
		vo.setBirthyear(1996);
		vo.setAddress("�õ�");
		vo.setPhone("010-2425-4724");
		vo.setGrade("GOLD");
		dao.updateCustomer(vo);
		
	}
	
	@Test
	public void testSelectCustomer() throws Exception {
		
		System.out.println(dao.readCustomer("cust01"));

	}
	
	@Test
	public void testDeleteCustomer() throws Exception {
		
		dao.deleteCustomer("cust01");
		
	}
	
}
