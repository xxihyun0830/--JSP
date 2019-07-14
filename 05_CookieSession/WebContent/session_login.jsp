<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(session.getAttribute("id") != null) { //이미 로그인이 되어 있다면
		String name = (String)session.getAttribute("nickName");
%>
	<%= name %>님이 현재 로그인중입니다. <br>
	<%-- 버튼 태그의 onclick 속성에는 자바스크립트 구문이나 자바스크립트 함수를 호출해서 클릭 이벤트 처리를 해야 함
		자바스크립트 내장 객체인 location의 href라는 속성을 사용하여 링크를 걸 수 있음 --%>
	<input type = "button" value = "메인으로" onclick = "location.href='session_welcome.jsp'">
	
	<%@include file="app_visit.jsp" %>
<%
	} else {
%>
	<div align="center">
		<form action="session_login_ok.jsp" method="post">
			ID: <input type="text" name="id" size="10">
			PW: <input type="password" name="pw" size="10">
			<input type="submit" value="로그인">
		</form>
	</div>
<%
	}
%>	
		
</body>
</html>








