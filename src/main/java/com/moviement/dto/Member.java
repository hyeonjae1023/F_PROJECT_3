package com.moviement.dto;

import java.util.Map;

public class Member extends Dto {
	public String loginId;
	public String loginPw;
	public int memberId;
	public String name;

	public Member(Map<String, Object> row) {
		super(row);
		this.loginId = (String) row.get("loginId");
		this.loginPw = (String) row.get("loginPw");
		this.memberId = (int) row.get("memberId");
		this.name = (String) row.get("name");
	}

	public Member(String loginId, String loginPw, String name) {
		this.loginId = loginId;
		this.loginPw = loginPw;
		this.name = name;
	}
}