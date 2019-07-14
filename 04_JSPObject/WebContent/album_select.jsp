<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String album = request.getParameter("title");
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% if (album.equals("blackpink")) { %>
	<div align = "center">
		<h2> 선택하신 앨범 정보 </h2>
		<p>
			당신이 선택한 앨범은 블랙핑크 앨범 SQUARE UP입니다.
		</p>
		<hr>
		<h3> 타이틀 곡 MV </h3>
		<iframe width="640" height="360" src="https://www.youtube.com/embed/legSnxdQI6U?rel=0;apm;autoplay=1" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
	</div>
	
	<% } else if (album.equals("redvelvet")) { %>
	<div align = "center">
		<h2> 선택하신 앨범 정보 </h2>
		<p>
			당신이 선택한 앨범은 레드벨벳 앨범 ICE CREAM CAKE입니다.
		</p>
		<hr>
		<h3> 타이틀 곡 MV </h3>
		<iframe width="640" height="360" src="https://www.youtube.com/embed/glXgSSOKlls?rel=0;apm;autoplay=1" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
	</div>
	
	<% } else if (album.equals("aoa")) { %>
	<div align = "center">
		<h2> 선택하신 앨범 정보 </h2>
		<p>
			당신이 선택한 앨범은 AOA 앨범 HEART ATTACK입니다.
		</p>
		<hr>
		<h3> 타이틀 곡 MV </h3>
		<iframe width="640" height="360" src="https://www.youtube.com/embed/brUyoeiEha4?rel=0;apm;autoplay=1" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
	</div>
	
	<% } %>
</body>
</html>