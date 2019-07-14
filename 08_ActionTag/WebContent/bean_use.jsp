<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id = "user" class = "controller.User" scope = "request"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%= user.getName() %>(<%= user.getId() %>)님, 안녕하세요.

</body>
</html>