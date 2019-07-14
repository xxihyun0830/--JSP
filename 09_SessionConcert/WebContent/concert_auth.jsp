<%@page import="java.util.UUID"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	UUID uuid = UUID.randomUUID(); //인증 문자 랜덤으로 만들어 주는 객체
	System.out.println(uuid);
	String[] uuids = uuid.toString().split("-"); // '-' 기준으로 자름
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>회원 인증 페이지</h2>
	<h1>인증 문자: <del><%= uuids[1] %></del></h1>
	<form action = "concert_auth_check.jsp" method="post"> <!-- > method = "get" 안 써도 됨! get이 디폴트 -->
		<small>위의 인증 문자를 입력하세요.</small>
		<input type = "text" name = "code" size = "5">
		<input type = "submit" value = "확인">
	</form>

</body>
</html>

<%
	session.setAttribute("authcode", uuids[1]);
%>