<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	요청 처리 과정에서 문제가 발생했습니다. <br>
	빠른 시간 내에 문제를 해결하도록 하겠습니다. ㅠㅠ
	<p>
	<%-- exception 내장 객체는 자바에서 Exception 클래스와 동일함, 사용하려면 page isErrorPage 명시해 줘야 함--%>
	에러 타입: <%= exception.getClass().getName() %> <br>
	에러 메시지: <%= exception.getMessage()%>
	</p>
</body>
</html>

<!-- 만약에 에러 페이지의 길이가 512 바이트보다 작다면, 인터넷 익스플로러는 이 페이지가 출력하는 에러 페이지를 내보내지 않고,
	 자체적으로 제공하는 'http 오류 메시지' 화면을 출력한다. 인터넷 익스플로러에서도 에러 페이지 내용을 올바르게 출력하려면
	 응담 결과에 데이터를 추가시켜서 512 바이트가 넘도록 해야 함. ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
	 ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
	 ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
	 ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ -->