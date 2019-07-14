<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align = "center">
	<form action = "bean_join.jsp" method = "post">
		<table border = "2" width = "500" cellspacing = "0" cellpadding = "0">
			<tr>
				<td align = "center">아이디</td>
				<td align = "center"><input type="text" name="id" size="10"></td>
				<td align = "center">비밀번호</td>
				<td align = "center"><input type="password" name="pw" size="10">
			</tr>
			
			<tr>
				<td align = "center">이름</td>
				<td align = "center"><input type="text" name="name" size="10"></td>
				<td align = "center">이메일</td>
				<td align = "center"><input type="text" name="email" size="10"></td>
			</tr>
			
			<tr>
				<td colspan = "4" align = "center">
					<input type = "submit" value = "회원가입">
				</td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>