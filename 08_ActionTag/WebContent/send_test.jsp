<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%-- sendRedirect 서블릿 실행 시, 객체 정보 안 뜨는 것 확인할 수 있음 --%>
	ID: <%= request.getAttribute("id") %><br>
	PW: <%= request.getAttribute("pw")%>
	
</body>
</html>