package com.kh.mvc.member.model.service;

import java.sql.Connection;

import static com.kh.mvc.common.jdbc.JDBCTemplate.*;
import com.kh.mvc.member.model.dao.MemberDao;
import com.kh.mvc.member.model.vo.Member;

public class MemberService {

	public Member login(String id, String password) {
		Connection connection = getConnection();
		
		Member member = new MemberDao().findMemberById(connection, id);

		close(connection);
		
		if(member == null || !member.getPassword().equals(password)) {
			return null;
		} else {
			return member;
		}
		
		
	}

	public int save(Member member) {
		int result = 0;
		Connection connection = getConnection();
		
		result = new MemberDao().insertMember(connection, member);
		
		if(result > 0) {
			commit(connection);
		} else {
			rollback(connection);
		}
		
		close(connection);
		
		return result;
	}

	public Boolean isDuplicateID(String id) {
		Connection connection = getConnection();
		
		Member member = new MemberDao().findMemberById(connection, id);
		
		close(connection);
		
		return member != null;
	}

}
