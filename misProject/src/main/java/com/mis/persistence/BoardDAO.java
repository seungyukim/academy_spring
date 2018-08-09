package com.mis.persistence;

import java.util.List;

import com.mis.domain.BoardVO;
import com.mis.domain.Criteria;
import com.mis.domain.SearchCriteria;

public interface BoardDAO {

	/**
	 * 게시물 등록
	 * @param vo
	 * @throws Exception
	 */
	public void create(BoardVO vo) throws Exception;
	
	/**
	 * 게시물 조회
	 * @param bno
	 * @return
	 * @throws Exception
	 */
	public BoardVO read(int bno) throws Exception;
	
	/**
	 * 게시물 수정
	 * @param vo
	 * @throws Exception
	 */
	public void update(BoardVO vo) throws Exception;
	
	/**
	 * 게시물 삭제
	 * @param bno
	 * @throws Exception
	 */
	public void delete(Integer bno) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
	/**
	 * 게시물 조회수 증가
	 * @param vo
	 * @throws Exception
	 */
	public void updateViewCnt(Integer bno) throws Exception;
	
	public List<BoardVO> listPage(int page) throws Exception;
	
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	
	public int countPaging(Criteria cri) throws Exception;
	
	// use for dynamic sql
	public List<BoardVO> listSearch(SearchCriteria cri) throws Exception;
	
	public int listSearchCount(SearchCriteria cri) throws Exception;
}



















