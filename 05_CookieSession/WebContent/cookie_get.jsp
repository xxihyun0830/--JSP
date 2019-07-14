<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie[] cookies = request.getCookies(); //로컬에 저장된 모든 쿠키 배열 가지고 오는 메소드
	
	for (int i = 0; i <cookies.length; i++){
		String str = cookies[i].getName();
		
		if(str.equals("id")){
			out.println("cookies[" + i + "] name: " + cookies[i].getName() + "<br>");
			out.println("cookies[" + i + "] value: " + cookies[i].getValue() + "<br>");
			out.println("===============<br>");
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
	<a href = "cookie_all.jsp">모든 쿠키 확인</a>
	<a href = "cookie_del.jsp">쿠키 삭제</a>
</body>
</html>