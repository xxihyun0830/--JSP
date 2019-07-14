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
			<table border = "1" width = "700">
				<tr>
					<td></td>
					<td align = "center">앨범 커버</td>
					<td align = "center">가수</td>
					<td align = "center">앨범 제목</td>
					<td align = "center">발매일</td>
				</tr>
				
				<tr>
					<td align = "center">
						<input type = "radio" name ="title" value = "blackpink">
					</td>
					<td align = "center">
					 <img src="img/album1.jpg" width="100" height="100"> 
					</td>
					<td align = "center">BLACKPINK</td>
					<td align = "center">SQUARE UP</td>
					<td align = "center">2018-06-15</td>
				</tr>
				
				<tr>
					<td align = "center">
						<input type = "radio" name ="title" value = "redvelvet">
					</td>
					<td align = "center">
					 <img src="img/album2.jpg" width="100" height="100"> 
					</td>
					<td align = "center">RED VELVET</td>
					<td align = "center">ICE CREAM CAKE</td>
					<td align = "center">2015-03-17</td>
				</tr>
				
				<tr>
					<td align = "center">
						<input type = "radio" name ="title" value = "aoa">
					</td>
					<td align = "center">
					 <img src="img/album3.jpg" width="100" height="100"> 
					</td>
					<td align = "center">AOA</td>
					<td align = "center">HEART ATTACK</td>
					<td align = "center">2015-06-22</td>
				</tr>
			
				
				<tr>
					<td colspan = "5" align = "center">
						<input type = "submit" value = "확인">
					</td>
				</tr>
					
				
					
			</table>
		
		
		</form>
	
	
	
	
	</div>

</body>
</html>