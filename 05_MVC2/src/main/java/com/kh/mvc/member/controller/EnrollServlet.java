package com.kh.mvc.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.mvc.member.model.service.MemberService;
import com.kh.mvc.member.model.vo.Member;

@WebServlet(name="enroll", urlPatterns="/member/enroll")
public class EnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EnrollServlet() {
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// 회원가입 페이지로 전환해주는 기능
    	request.getRequestDispatcher("/views/member/enroll.jsp").forward(request, response);
    }

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Member member = new Member();
    	
    	member.setId(request.getParameter("userId"));
    	member.setPassword(request.getParameter("userPwd"));
    	member.setName(request.getParameter("userName"));
    	member.setPhone(request.getParameter("phone"));
    	member.setEmail(request.getParameter("email"));
    	member.setAddress(request.getParameter("address"));
    	member.setHobby(String.join(",", request.getParameterValues("hobby")));
    	
    	
    	System.out.println(member);
    	
    	int result = new MemberService().save(member);
    	
    	if(result > 0) {
    		// 회원 가입 완료
    		request.setAttribute("msg", "회원 가입 성공");
    		request.setAttribute("location", "/");
    	} else {
    		// 회원 가입 실패
			request.setAttribute("msg", "회원 가입 실패");
			request.setAttribute("location", "/member/enroll");
			
    	}
    	// 2. request 객체의 데이터를 유지해서 에러 메시지 출력 페이지에 전달하기 위해 forward() 실행
    	request.getRequestDispatcher("/views/common/msg.jsp").forward(request, response);
    	
    }

}
