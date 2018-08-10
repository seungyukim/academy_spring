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

import com.mis.domain.ProductVO;
import com.mis.persistence.ProductDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class ProductDAOTest {

	@Inject
	private ProductDAO dao;
	
	private static Logger logger = LoggerFactory.getLogger(ProductDAOTest.class);
	
	@Test
	public void test01Insert() throws Exception {
		ProductVO product = new ProductVO();
		product.setProdname("아디다스 슬리퍼");
		product.setPrice(29900);
		product.setQuantity(15);
		logger.debug("TEST : " + product);
		dao.insert(product);
		
	}
	
	@Test
	public void test02Read() throws Exception {
		logger.info(dao.read(1).toString());
	}
	
	@Test
	public void test03Update() throws Exception {
		ProductVO product = new ProductVO();
		product.setProdcod(3);
		product.setProdname("아디다스 슬리퍼");
		product.setPrice(19900);
		product.setQuantity(5);
		logger.debug("TEST : " + product);
		dao.update(product);
		
	}
	
	@Test
	public void test04Delete() throws Exception {
		dao.delete(1);
	}
	
}





















