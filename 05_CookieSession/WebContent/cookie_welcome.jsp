<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie[] cookies = request.getCookies();

	for (int i = 0; i < cookies.length; i++){
		String id = cookies[i].getValue();
		if (id.equals("abc1234")){
			out.println(id + "님 안녕하세요 <br>");
		}
	}
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href = "cookie_logout.jsp">LOGOUT</a>
</body>
</html>