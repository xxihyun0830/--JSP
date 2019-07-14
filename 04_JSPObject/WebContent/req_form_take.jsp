<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String name, id, pw, major, region;
	String [] hobbys;
%>
<%
	request.setCharacterEncoding("utf-8"); //요청 데이터 한글 처리 (post 방식일 때)
	
	name =  request.getParameter("name"); //name 속성의 이름을 ()에 넣으면 됨
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	major = request.getParameter("major");
	region = request.getParameter("region");
	hobbys = request.getParameterValues("hobby");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름: <%= name %> <br>
	ID: <%= id %> <br>
	PW: <%= pw %> <br>
	전공: <%= major%> <br>
	지역: <%= region %> <br>
	취미: <%= Arrays.toString(hobbys) %> <!-- ctrl + space -> import -->
</body>
</html>