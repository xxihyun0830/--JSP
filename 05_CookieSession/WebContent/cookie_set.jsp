<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie cookie = new Cookie("id", "abc1234");
	//쿠키 객체 생성자 매개 값으로 준 데이터 : 첫 번째 인자는 쿠키 이름, 두 번째 인자는 쿠키의 값 (key-value)
	cookie.setMaxAge(60*60); //60초 x 60초 = 1시간
			
	response.addCookie(cookie);
%>    
    
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href = "cookie_get.jsp">쿠키 가져오기</a>
</body>
</html>