<%@page import="java.util.TreeSet"%>
<%@ page import = "java.util.Set" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Set<Integer> mySet = new TreeSet<>();
	
	while(true){
		int ran = (int)(Math.random()*45) + 1;
		mySet.add(ran);
		if(mySet.size() ==6) {
			break;
		}
	}
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>로또 번호 생성 결과</h2>
	<p>
		이번 주 로또는 아래 번호입니다. <br>
		<b><%= mySet.toString() %> </b>
	</p>
	
</body>
</html>