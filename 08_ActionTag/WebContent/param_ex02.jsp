<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% request.setCharacterEncoding("utf-8"); %>

<jsp:forward page="param_ex03.jsp">
	<jsp:param name = "addr" value = "서울시"/>
</jsp:forward>

