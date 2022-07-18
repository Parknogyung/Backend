<%@page import="java.util.Date"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 내장 객체</title>
</head>
<body>
	<h1>JSP 내장 객체</h1>
	<%--	
	<%
		out 변수가 존재하기 때문에 에러남
		String out = "";
	%>
	 --%>
	 <h2>1. request 객체</h2>
	 <p>
	 	웹 브라우저의 요청 정보를 가지고 있는 객체이다.
	 </p>
	 
	 <h3>1) 헤더와 관련된 메소드</h3>
	 <table border="1">
	 	<tr>
	 		<th>헤더</th>
	 		<th>값</th>
	 	</tr>
	 	<%
	 	Enumeration<String> names = request.getHeaderNames();
	 	
	 	while(names.hasMoreElements()) {
	 		String name = names.nextElement();
	 	%>
	 	<tr>
	 		<td><%= name %></td>
	 		<td><%= request.getHeader(name) %></td>
	 	</tr>
	 	<%
	 	}
	 	%>
	 </table>
	 
	 <h3>2) URL/URI, 요청 방식과 관련된 메소드</h3>
	 <table border="1">
	 	<tr>
	 		<th>이름</th>
	 		<th>값</th>
	 	</tr>
	 	<tr>
	 		<td>서버 도메인명</td>
	 		<td><%= request.getServerName() %></td>
	 	</tr>
	 	<tr>
	 		<td>서버 포트 번호</td>
	 		<td><%= request.getServerPort() %></td>
	 	</tr>
	 	<tr>
	 		<td>URL</td>
	 		<td><%= request.getRequestURL() %></td>
	 	</tr>
	 	<tr>
	 		<td>URI</td>
	 		<td><%= request.getRequestURI() %></td>
	 	</tr>
	 	<tr>
	 		<td>요청 쿼리</td>
	 		<td><%= request.getQueryString() %></td>
	 	</tr>
	 	<tr>
	 		<td>프로토콜</td>
	 		<td><%= request.getProtocol() %></td>
	 	</tr>
	 	<tr>
	 		<td>요청 방식</td>
	 		<td><%= request.getMethod() %></td>
	 	</tr>
	 	<tr>
	 		<td>웹 애플리케이션 경로</td>
	 		<td><%= request.getContextPath() %></td>
	 	</tr>
	 	<tr>
	 		<td>클라이언트의 IP 주소</td>
	 		<td><%= request.getRemoteAddr() %></td>
	 	</tr>
	 	<tr>
	 		<td>클라이언트의 호스트 명</td>
	 		<td><%= request.getRemoteHost() %></td>
	 	</tr>
	 </table>
	 
	 <h2>2. response 객체</h2>
	 <p>
	 	웹 브라우저의 요청에 대한 응답 객체이다.
	 </p>
	 
	 <h3>1) Redirect</h3>
	 <p>
	 	sendRedirect(String url); <br>
	 	매개값으로 지정한 URL로 요청을 재전송한다. <br>
		리다이렉트 방식은 요청과 응답객체를 새로 생성하므로 이전 요청과 응답 정보가 유지되지 않는다.
	 </p>
	 
	 <a href="redirect.jsp">Redirect 테스트</a>
	 
	 <h2>3. pageContext</h2>
	 <p>
	 	JSP와 관련된 다른 내장 객체를 얻어내거나 현재 페이지에 요청과 응답의 제어권을 다른 페이지로 넘겨주는데 사용하는 객체이다.
	 </p>
	 
	 <h3>1) Forward</h3>
	 <p>
	 	forward(String url); <br>
	 	매개값으로 지정한 URL로 요청과 응답에 관한 제어권을 영구적으로 넘긴다. <br>
	 	포워드 방식은 현재 페이지의 요청과 응답 정보를 다른페이지로 넘기기 때문에 요청 정보와 응답 정보가 유지된다.
	 </p>
	 
	 <a href="forward.jsp">Forward 테스트</a>
	 
	 <h2>4. session 객체</h2>
	 <p>
	 	웹 브라우저의 정보를 유지하기 위한 세션 정보를 저장하고 있는 객체이다.
	 </p>
	 <%
	 	Cookie cookie = new Cookie("userId", "ismoon");
	 
	 	cookie.setMaxAge(10);
	 
	 	response.addCookie(cookie);
	 	
	 	session.setMaxInactiveInterval(10);
	 %>
	 
	 세션 ID : <%= session.getId() %> <br>
	 isNew : <%= session.isNew() %> <br>
	 생성 시간 : <%= new Date(session.getCreationTime()) %> <br>
	 최종 접속 시간 : <%= new Date(session.getLastAccessedTime()) %> <br>
	 
	 <h2>5. Application 객체</h2>
	 
	 <p>
	 	웹 애플리케이션(컨텍스트)의 실행 환경을 제공하는 서버의 정보와 서버 측 자원에 대한 정보를 저장하고 있는 객체이다.
	 </p>
	 
	 <table border="1">
	 	<tr>
	 		<td>웹 모듈 버전</td>
	 		<td><%= application.getMajorVersion() %>.<%= application.getMinorVersion() %></td>
	 	</tr>
	 	<tr>
	 		<td>컨테이너 정보</td>
	 		<td><%= application.getServerInfo() %></td>
	 	</tr>
	 	<tr>
	 		<td>웹 애플리케이션의 실제 파일시스템 경로</td>
	 		<td><%= application.getRealPath("/") %></td>
	 	</tr>
	 </table>
	 
</body>
</html>