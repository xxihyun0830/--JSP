<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%!
		int i = 10;
		String str = "Hello World!";
		
		public int add(int a, int b){
			return a + b;
		}
	%>
	
	<%
		//jsp에서는 PrintWriter 객체 out은 서버에서 자동으로 생성해 줌 - (PrintWriter-브라우저에 보여 줌) : 내장 객체
		//PrintWriter out = response.getWriter(); //내장 객체 response와 out
		out.println("i의 값은: " + i + "<br>");
		out.println("str의 값은: " + str + "<br>");
		out.println("30과 50의 합은: " + add(30, 50));
	%>
	
</body>
</html>