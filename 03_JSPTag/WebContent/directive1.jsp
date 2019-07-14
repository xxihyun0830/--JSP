<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces = "true" %> <%-- 페이지 소스 보기에서 자바 코드 지워진 흰 공백 안 보여 줌 --%>
<%
	Calendar cal = Calendar.getInstance();%> <%-- abstract class이기 때문에 --%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	오늘은
	<%= cal.get(Calendar.YEAR) %> 년&nbsp;
	<%= cal.get(Calendar.MONTH) + 1 %>월&nbsp;
	<%= cal.get(Calendar.DATE) %>일입니다. <br>
	
	현재 시각: <%= new java.util.Date() %>

</body>
</html>