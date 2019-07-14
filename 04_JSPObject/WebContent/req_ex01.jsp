<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>BMI 계산하기</h2>
	<hr>
	
	<p>
		<form action = "req_ex02.jsp" method = "post">
		신장: <input type = "text" name = "cm"> cm <br>
		몸무게: <input type = "text" name = "kg"> kg <br>
		
		<input type = "submit" value = "확인">
		<input type = "submit" value = "취소">
		
		</form>
	</p>
</body>
</html>