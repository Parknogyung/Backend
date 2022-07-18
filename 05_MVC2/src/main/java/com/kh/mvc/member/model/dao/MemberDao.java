package com.kh.mvc.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.kh.mvc.member.model.vo.Member;

public class MemberDao {

	public Member findMemberById(String id) {
		Member member = null;
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "SELECT * FROM MEMBER WHERE ID=? AND STATUS='Y'";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "WEB", "WEB");
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, id);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getInt("NO"));
				System.out.println(rs.getString("ID"));
				System.out.println(rs.getString("NAME"));
				System.out.println(rs.getString("ROLE"));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return member;
	}

}
