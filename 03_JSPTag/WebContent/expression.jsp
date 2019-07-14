<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%!
		//전역 변수로 선언 - class expression_jsp 내에서 선언
		String str = "Hello";
		double d = 3.1415;
	%>
	
	<%
		//지역 변수로 선언 -  _jspService() 내에서 선언
		int age = 30;
		String name = "홍길동";
	%>
	
	<!-- 표현식에는 세미콜론 사용하지 않음 -->
	이름: <%= name %> <br>
	나이: <%= age %> <br>

</body>
</html>