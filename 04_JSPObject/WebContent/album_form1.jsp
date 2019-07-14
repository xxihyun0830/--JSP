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
		<form action = "album_select.jsp">
			<table align = "center" border = "1" width = "700">
				<tr>
					<td align = "center">앨범 커버</td>
					<td align = "center">가수</td>
					<td align = "center">앨범 제목</td>
					<td align = "center">발매일</td>
				</tr>
				
				<tr>
					<td align = "center">
					 <img src="img/album1.jpg" width="100" height="100"> 
					</td>
					<td align = "center">BLACKPINK</td>
					<td align = "center">
						<a href = "album_select.jsp?title=blackpink"> <!-- ?title=blackPink 로 바로 넘겨주는 거를 뜻한다. -->
						SQUARE UP
						</a>	
					</td>
					<td align = "center">2018-06-15</td>
				</tr>
				
				<tr>
					<td align = "center">
					 <img src="img/album2.jpg" width="100" height="100"> 
					</td>
					<td align = "center">RED VELVET</td>
					<td align = "center">
						<a href = "album_select.jsp?title=redvelvet">
						ICE CREAM CAKE
						</a>
					</td>
					<td align = "center">2015-03-17</td>
				</tr>
				
				<tr>
					<td align = "center">
					 <img src="img/album3.jpg" width="100" height="100"> 
					</td>
					<td align = "center">AOA</td>
					<td align = "center">
						<a href = "album_select.jsp?title=aoa">
						HEART ATTACK
						</a>
					</td>
					<td align = "center">2015-06-22</td>
				</tr>
	
				
					
			</table>
		
		
		</form>
	
	
	
	
	</div>

</body>
</html>