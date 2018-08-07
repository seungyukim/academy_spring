package com.mis.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.CustomerVO;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.mis.mapper.CustomerMapper"; // XML Mapper를 인식하도록 설정

	@Override
	public void insertCustomer(CustomerVO vo) {

		sqlSession.insert(namespace + ".insertCustomer", vo);
	}
	
	@Override
	public CustomerVO readCustomer(String userid) throws Exception {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("userid", userid);
		
		return sqlSession.selectOne(namespace + ".readCustomer", paramMap);
	}

	@Override
	public void updateCustomer(CustomerVO vo) throws Exception {
		
		sqlSession.update(namespace + ".updateCustomer", vo);
		
	}

	@Override
	public void deleteCustomer(String userid) throws Exception {
		
		sqlSession.delete(namespace + ".deleteCustomer", userid);
		
	}
	
}
