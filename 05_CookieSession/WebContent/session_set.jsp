<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//setAttribute(세션 이름, 세션값): 세션에 데이터를 저장하는 메소드
	//session 객체 데이터는 브라우저와 수명을 함께함
	session.setAttribute("id", "abc1234");
	session.setAttribute("name", "홍길동");
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="session_test.jsp">세션 정보 확인</a>
</body>
</html>