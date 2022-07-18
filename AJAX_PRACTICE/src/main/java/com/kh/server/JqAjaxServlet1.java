package com.kh.server;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JqAjaxServlet1
 */
@WebServlet("/jqAjax1.do")
public class JqAjaxServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public JqAjaxServlet1() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String input = request.getParameter("input");
		
		System.out.println("입력 값 : " + input);
		
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().printf("입력하신 값의 길이는 %s 입니다.", input.length());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		System.out.println("이름 : " + name + ", 나이 : " + age);
		
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().print("이름 : " + name + ", 나이 : " + age);
	}
}
