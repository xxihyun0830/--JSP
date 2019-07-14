<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// Servlet과는 달리, HttpServlet request = new 이런 거 안 만들어도 됨
	String protocol = request.getProtocol();
	String method = request.getMethod();
	StringBuffer reqUrl = request.getRequestURL();
	String reqUri = request.getRequestURI();
	String query = request.getQueryString(); //url의 파라미터를 읽어 파라미터 정보를 가져옴 ex)http://localhost:8181/pancakes/index.jsp?id=abc123에서 'id=123' 정보
	String conPath = request.getContextPath(); //context root 가지고 옴
	String serverName = request.getServerName();
	int serverPort = request.getServerPort();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	요청 정보 프로토콜: <%= protocol %> <br>
	요청 정보 전송 방식: <%= method %> <br>
	요청 URL 정보: <%= reqUrl %> <br>
	요청 URI 정보: <%= reqUri %> <br>
	요청 파라미터 변수: <%= query %> <br> <!-- url뒤에 '?변수이름 = 정보' 쓰고 엔터 누르고 전송해 보기 -->
	컨텍스트 루트 경로: <%= conPath %> <br>
	서버 이름: <%= serverName %> <br>
	서버 포트 번호: <%= serverPort %>
</body>
</html>