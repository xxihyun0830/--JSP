<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String email = request.getParameter("email");
	String addr = request.getParameter("addr");
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디: <%= id %><br>
	비밀번호: <%= pw %><br>
	이메일: <%= email %><br>
	주소: <%= addr %><br>
</body>
</html>

