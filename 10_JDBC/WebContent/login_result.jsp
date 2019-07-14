<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = (String)session.getAttribute("name");
	String id = (String)session.getAttribute("id");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	 <h3><%=name %>(<%=id %>)님 안녕하세요.</h3>
	 <a href="update.jsp">회원정보 수정</a>
	 <a href="Deleteok">회원 탈퇴</a>

</body>
</html>







