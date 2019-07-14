<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%-- 내부 스타일 지정 방법: <style></style> 태그 사용
	 스타일 태그 내부에 클래스 이름을 .으로 선택한다 ex).login_btn --%>
<style>
	.login_btn {
		width: 60px;
		height: 50px;
		background-color: pink;
	}
</style>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align = "center">
		<h2>sendRedirect 로그인</h2>
		<hr>
		<br>
		
		<form action = "res_login_take.jsp" method = "post">
			<table border = "1" cellpadding = "0" cellspacing = "0">
				<tr>
					<td>
						<input type = "text" name = "id" size = "10" placeholder = "아이디">
					</td>
					<td rowspan = "2">
						<!-- 태그에 내부 스타일 시트 적용 태그 내부에 속성 class 지정
							 head 태그 내부에서 해당 클래스를 사용하여 스타일을 지정
							 F12 > Styles에서 그림 보면서 픽셀 크기 맞춰 보기-->
							 
						<input type = "submit" value = "LOGIN" class = "login_btn">
					</td>
				</tr>
			
				<tr>
					<td>
						<input type = "password" name = "pw" size = "10" placeholder = "비밀번호">
					</td>
				</tr>
			</table>
		
		
		</form>
	
	
	
	</div>
</body>
</html>