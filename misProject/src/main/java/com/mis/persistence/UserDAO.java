package com.mis.persistence;

import com.mis.domain.LoginDTO;
import com.mis.domain.UserVO;

public interface UserDAO {

	/**
	 * 로그인
	 * @param dto
	 * @return
	 * @throws Exception
	 */
	public UserVO login(LoginDTO dto) throws Exception;
}
