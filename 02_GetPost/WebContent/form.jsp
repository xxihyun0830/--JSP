<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!--  form 태그에 action 속성에는 폼 데이터를 처리할 서블릿의 매핑된 url 적음
	method 속성에는 요청 처리 방식 (get/post) 적음 (default는 get) -->
	<!-- get 방식은 url에 데이터 묻어서 나가서 정보 노출됨 ex)http://localhost:8181/GetPost/TakeForm?id=123&pw=123 -->
	<!-- 폼 데이터 내 name 속성이 변수 이름으로 사용됨 -->
	
	<form action = "TakeForm" method = "post">
	ID: <input type = "text" name = "id"><br>
	PW: <input type = "password" name = "pw"><br>
	<input type = "submit" value = "확인">
	</form>

</body>
</html>