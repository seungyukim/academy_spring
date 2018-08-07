package com.mis.persistence;

import com.mis.domain.CustomerVO;

public interface CustomerDAO {

	/**
	 * Customer ���̺� ������ ����
	 * @param vo
	 */
	public void insertCustomer(CustomerVO vo);
	
	/**
	 * userid ���� �޾Ƽ� �ش��ϴ� Customer ���̺��� ������ �б�
	 * @param userid : �����̵�
	 * @return
	 * @throws Exception
	 */
	public CustomerVO readCustomer(String userid) throws Exception;
	
	/**
	 * Customer ���̺��� ������ ����
	 * @param vo
	 * @throws Exception
	 */
	public void updateCustomer(CustomerVO vo) throws Exception;
	
	/**
	 * userid ���� �޾Ƽ� �ش��ϴ� Customer ���̺��� ������ ����
	 * @param userid
	 * @throws Exception
	 */
	public void deleteCustomer(String userid) throws Exception;
}
