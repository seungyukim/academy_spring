package com.mis.persistence;

import java.util.List;

import com.mis.domain.BoardVO;

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
}
