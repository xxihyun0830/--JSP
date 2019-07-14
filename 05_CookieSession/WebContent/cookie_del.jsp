<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie[] cookies = request.getCookies();
	for (int i = 0; i < cookies.length; i++) {
		String str = cookies[i].getName();
		
		if (str.equals("id")){
			out.println("name: " + cookies[i].getName() + "가 삭제되었습니다. <br>");
			cookies[i].setMaxAge(0);
			response.addCookie(cookies[i]);
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
	<a href = "cookie_get.jsp">쿠키 확인</a>
</body>
</html>