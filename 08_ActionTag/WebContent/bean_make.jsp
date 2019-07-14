<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id = "user" class = "controller.User" scope = "request"/>
<%
	user.setId("abc123");
	user.setName("홍길동");
%>

<jsp:forward page = "bean_use.jsp"/>