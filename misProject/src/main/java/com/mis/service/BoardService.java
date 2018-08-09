package com.mis.service;

import java.util.List;

import com.mis.domain.BoardVO;
import com.mis.domain.Criteria;

public interface BoardService {

	public void regist(BoardVO board) throws Exception;

	public BoardVO read(int bno) throws Exception;
	
	public void modify(BoardVO board) throws Exception;
	
	public void remove(int bno) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
//	public void updateViewCnt(Integer bno) throws Exception;
	
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;

	public int listCountCriteria(Criteria cri) throws Exception;
	
}
