<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color:red">에러가 발생하였습니다. 관리자에게 문의해주세요.</h1>
	<!-- 아래 메소드를 쓸려면 위의 isErrorPage 속성이 들어가야 한다. -->
	<%= exception %> <br>
	<%= exception.getMessage() %> <br>
	<%= exception.getClass().getName() %> <br>
</body>
</html>