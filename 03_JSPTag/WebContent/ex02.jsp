<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int total = 0; //전역 변수 total
%>

<%
	total++;
	int r = (int)(Math.random()*8) + 2;
%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>
	현재 페이지 요청 횟수: <%= total %> <br>
	<%if (total % 10 == 0){ %>
		매 <b>10</b>번째 요청을 보내시는 사용자에게는 특별한 선물이 준비되어 있습니다
	<%} %>
	</p>
	
	<hr>
	
	<h2>랜덤 구구단 <%= r %>단</h2>
	이번에 나온 구구단은 <%= r %>단입니다.
	
	<p>
	<%
	for (int i = 1; i <= 9; i++){ %>
		<%= r %> X <%= i %> = <%= r * i %> <br>
		
	<% } %>
	</p>

</body>
</html>