<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입창</title>
</head>

<body>
	<h2>회원 가입</h2> <hr>
	
	<form action = "JoinOk" method = "get">
	이름: <input type = "text" name = "name" size = "10"><br>
	ID: <input type = "text" name = "id" size = "10"><br>
	PW: <input type = "password" name = "pw" size = "10"><br>
	취미:
	<input type = "checkbox" name = "hobby" value = "reading">독서&nbsp;
	<input type = "checkbox" name = "hobby" value = "cooking">요리&nbsp;
	<input type = "checkbox" name = "hobby" value = "조깅">조깅&nbsp;
	<input type = "checkbox" name = "hobby" value = "수영">수영&nbsp;
	<br>
	전공:
	<input type = "radio" name = "major" value = "kor">국어국문&nbsp;
	<input type = "radio" name = "major" value = "design">디자인&nbsp;
	<input type = "radio" name = "major" value = "comsci">컴퓨터공학&nbsp;
	<br>
	지역:
	<select name = "region">
		<option value = "seoul">서울</option>
		<option value = "pusan">부산</option>
		<option value = "daejeon">대전</option>
		<option value = "gwangju">광주</option>
		<option value = "jeju">제주</option>
	</select>
	<br>
	<input type = "submit" value = "전송">
	<input type = "submit" value = "취소">
	</form>
	
</body>
</html>