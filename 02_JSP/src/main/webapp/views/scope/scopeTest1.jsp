<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>application 영역과 session 영역을 비교</h2>
	현재 application 영역에 저장된 데이터 : <%= application.getAttribute("name") %> <br>
	현재 session 영역에 저장된 데이터 : <%= session.getAttribute("address") %>
</body>
</html>