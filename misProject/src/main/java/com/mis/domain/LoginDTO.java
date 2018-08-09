package com.mis.domain;

/**
 * 로그인 화면에 이용하는 DTO
 * @author SeungYu
 *
 */
public class LoginDTO {

	private String usid;
	private String upw;
	private boolean userCookie;
	public String getUsid() {
		return usid;
	}
	public void setUsid(String usid) {
		this.usid = usid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public boolean isUserCookie() {
		return userCookie;
	}
	public void setUserCookie(boolean userCookie) {
		this.userCookie = userCookie;
	}
	@Override
	public String toString() {
		return "LoginDTO [usid=" + usid + ", upw=" + upw + ", userCookie=" + userCookie + "]";
	}
	
	
}
