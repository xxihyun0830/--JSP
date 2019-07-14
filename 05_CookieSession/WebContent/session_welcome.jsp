<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String name;
	String id;
%>    
<%
	if(session.getAttribute("id") == null) {
		response.sendRedirect("session_login.jsp");
	} else {
		name = (String)session.getAttribute("nickName");
		id = (String)session.getAttribute("id");		
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>로그인 성공! <%= name %>(<%=id %>)님, 안녕하세요.</h3>
	<a href="session_login.jsp">로그인 페이지로</a>
	<a href="session_logout.jsp">로그아웃</a>
	
	<%@include file="app_visit.jsp" %>
</body>
</html>



