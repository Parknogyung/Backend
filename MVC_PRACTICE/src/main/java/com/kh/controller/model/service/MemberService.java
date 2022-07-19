package com.kh.controller.model.service;

import com.kh.controller.model.dao.MemberDao;
import com.kh.controller.model.vo.Member;

public class MemberService {

	public Member login(String userId, String userPwd) {
		Member member = new MemberDao().findMemberById(userId);
		
		if(member == null || !member.getPassword().equals(userPwd)) {
			return null;
		} else {
			return member;
		}
	}
	
}
