package com.mis.persistence;

import java.util.List;

import com.mis.domain.Criteria;
import com.mis.domain.ProductVO;
import com.mis.domain.SearchCriteria;

public interface ProductDAO {

	/**
	 * Product 정보 1건을 추가함
	 * @param vo : 추가할 제품 정보
	 * @throws Exception
	 */
	public void insert(ProductVO vo) throws Exception;
	
	/**
	 * Product 정보 1개를 조회함
	 * @param prodcod : 조회할 제품정보의 코드값(prodcod)
	 * @return
	 * @throws Exception
	 */
	public ProductVO read(Integer prodcod) throws Exception;

	/**
	 * Product 1개의 정보를 수정함
	 * @param vo : 수정할 제품정보의 코드값(prodcod)만 담고있는 객체
	 * @throws Exception
	 */
	public void update(ProductVO vo) throws Exception;
	
	/**
	 * Product 1개의 정보를 삭제함
	 * @param prodcod : 삭제할 제품정보의 코드값(prodcod)
	 * @throws Exception
	 */
	public void delete(Integer prodcod) throws Exception;
	
	/**
	 * 전체 제품 목록을 List<Product> 타입으로 바꾸어 리턴한다.
	 * @return
	 * @throws Exception
	 */
	public List<ProductVO> searchlist() throws Exception;
	
	public List<ProductVO> listPage(int page) throws Exception;
	
	public List<ProductVO> listCriteria(Criteria cri) throws Exception;
	
	public int countPaging(Criteria cri) throws Exception;
	
	// use for dynamic sql
	public List<ProductVO> listSearch(SearchCriteria cri) throws Exception;
	
	public int listSearchCount(SearchCriteria cri) throws Exception;
}
