<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% try { %>
		<%= request.getParameter("addr").toUpperCase() %>
	<%
		} catch (Exception e) {
	%>
		addr 파라미터가 올바르지 않습니다. <br>
		죄송합니다. 빨리 복구하겠습니다.
	<% } %>
</body>
</html>