package com.kh.mvc.member.model.service;

import com.kh.mvc.member.model.dao.MemberDao;
import com.kh.mvc.member.model.vo.Member;

public class MemberService {

	public Member login(String id, String password) {
		Member member = null;
		
		member = new MemberDao().findMemberById(id);
		
		return member;
	}

}
