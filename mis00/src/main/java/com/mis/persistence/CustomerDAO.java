package com.mis.persistence;

import com.mis.domain.CustomerVO;

public interface CustomerDAO {

	/**
	 * Customer 테이블에 데이터 삽입
	 * @param vo
	 */
	public void insertCustomer(CustomerVO vo);
	
	/**
	 * userid 값을 받아서 해당하는 Customer 테이블의 데이터 읽기
	 * @param userid : 고객아이디
	 * @return
	 * @throws Exception
	 */
	public CustomerVO readCustomer(String userid) throws Exception;
	
	/**
	 * Customer 테이블의 데이터 수정
	 * @param vo
	 * @throws Exception
	 */
	public void updateCustomer(CustomerVO vo) throws Exception;
	
	/**
	 * userid 값을 받아서 해당하는 Customer 테이블의 데이터 삭제
	 * @param userid
	 * @throws Exception
	 */
	public void deleteCustomer(String userid) throws Exception;
}
