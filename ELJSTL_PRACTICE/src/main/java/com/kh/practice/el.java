package com.kh.practice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class el
 */
@WebServlet("/el.do")
public class el extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public el() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("classroom", "c강의장");
		request.setAttribute("student", new Student("홍길동", 20, 80, 80));
		
		request.getRequestDispatcher("/el.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
