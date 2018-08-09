package com.mis.service;

import com.mis.domain.LoginDTO;
import com.mis.domain.UserVO;

public interface UserService {
	public UserVO login(LoginDTO dto) throws Exception;
}
