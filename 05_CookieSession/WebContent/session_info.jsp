<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	세션 ID: <%= session.getId() %> <br>
	<%
		date.setTime(session.getCreationTime());
	%>
	세션 생성 시간: <%= sdf.format(date) %> <br>
	<%
		date.setTime(session.getLastAccessedTime());
	%>
	최근 접근 시간: <%= sdf.format(date) %> <br>
</body>
</html>