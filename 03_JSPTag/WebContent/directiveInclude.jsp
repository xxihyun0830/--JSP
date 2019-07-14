<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ include file = "include/header.jsp" %>    


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>방문자 수: <%= visit %></h2> <!-- header.jsp 인클루드해서 변수 사용 가능 -->
	<h3>바디 부분</h3> <br>
	
	<%@ include file = "include/footer.jsp" %>
</body>
</html>