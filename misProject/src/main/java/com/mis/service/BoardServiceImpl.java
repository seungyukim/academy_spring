package com.mis.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.domain.BoardVO;
import com.mis.domain.Criteria;
import com.mis.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	@Override
	public void regist(BoardVO board) throws Exception {
		
		dao.create(board);
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		// 컨트롤러 건드리지 않고 서비스단에서 조회수 증가를 시킬수 있음
		dao.updateViewCnt(bno);
		return dao.read(bno);
	}

	@Override
	public void modify(BoardVO board) throws Exception {

		dao.update(board);
	}

	@Override
	public void remove(int bno) throws Exception {

		dao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {

		return dao.listAll();
	}

//	@Override
//	public void updateViewCnt(Integer bno) throws Exception {
//		dao.updateViewCnt(bno);		
//	}

	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {

		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		
		return dao.countPaging(cri);
	}


}
