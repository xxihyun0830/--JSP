<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	List<String> myList = new ArrayList<>(); //전역 변수 myList
%>

<%
	String [] jobs = {"전사", "도적", "사냥꾼", "마법사", "사제"};
	int r = (int)(Math.random() * 5);
	String chosenJob = jobs[r];
	myList.add(chosenJob);
	
	int cnt = 0;
	for(String e : myList){
		if(e.equals(chosenJob)){
			cnt++;
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
	
	<h2>당신의 역할</h2><br>
	<p>
		당신에게 부여된 역할은 <b>[<%= chosenJob %>]</b>입니다.<br>
		현재 그룹에 당신과 같은 역할을 가진 플레이어는 <%= cnt%>명입니다.
	</p>

	<p>
		현재 그룹 구성 <br>
		<%= myList.toString() %>
		(<%= myList.size() %>명 참가 중)
	</p>

</body>
</html>

<%
	if(myList.size() == 10){
		myList.clear();
	}
%>