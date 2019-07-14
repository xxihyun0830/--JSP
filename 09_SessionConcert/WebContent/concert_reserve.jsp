<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("auth") == null) { //인증 안 하고 url 따서 예매하려는 경우 빠꾸 침
		response.sendRedirect("concert_auth.jsp");
		return; //아래의 로직도 실행 못 하도록 해 버림
	}

	List<String> list = new ArrayList<>(); //이 collection에 generic의 타입만 받음
	if (application.getAttribute("list") != null){
		list = (List<String>)application.getAttribute("list");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align = "center">
		<h2>콘서트 좌석 예약</h2>
		<h4>예약할 좌석을 선택한 후, 예약 버튼을 눌러 주세요.</h4>
		<hr>
		
		<form action = "concert_seat_check.jsp">

		<p align="center">
		<b>좌석 배치도</b><br>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<%
			for (char c='A'; c<='Z'; c++) {
		%>
			<small><%= c %></small>&nbsp;&nbsp;
         <%
			}
         %>
         
         <br>
         
		<%
			for(int r=1; r<=3; r++) {
		%>
				<%= r %>
			<%
				for(char c='A'; c<='Z'; c++) {
					String val = c +"-"+ r;        
			%>   
				<%
					if(list.contains(val)) {
				%>
						<input type="checkbox" name="seat" value="<%=val%>" disabled>
				<%
					} else {
				%>
						<input type="checkbox" name="seat" value="<%=val%>">
				<%
					}
				%>   
			<%
				}
			%>         
			<br>		
		<%
			}
		%>
         <br>
         
		<%
			for (int r=4; r<=6; r++) {
		%>
				<%= r %>
			<%
				for (char c='A'; c<='Z'; c++) {
				String val = c +"-"+ r;            
			%>
				<%
					if(list.contains(val)) {
				%>
						<input type="checkbox" name="seat" value="<%=val%>" disabled>
				<%
					} else {
				%>
						<input type="checkbox" name="seat" value="<%=val%>">
				<%
					}
				%>   
			<%
				}
			%>         
			<br>
		<%
		}
		%>   
		<br><br>   
		<input type="submit" value="예약">
		<input type="reset" value="재설정">
		</p>
		</form>
	</div>
</body>
</html>