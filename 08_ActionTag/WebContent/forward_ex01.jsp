<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- action 태그 사용법 <jsp:사용할 속성></jsp:사용할 속성>
	 닫는 태그를 사용할 때, 태그 내부에 작성할 추가 내용이 없다면, 닫는 태그를 사용하지 않고 열린 태그 부분의 마지막 꺽새에 (/>) 이것을 사용함
	 forward 태그: sendRedirect 태그와 같은 기능, But 그와 다르게 리다이렉트된 페이지 주소가 아니라 이 페이지 주소가 뜸--%>

<jsp:forward page = "forward_ex02.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>forward01 페이지입니다.</h1>
	<h2>페이지 강제 이동을 하면 이 페이지가 나타날까요?</h2>
</body>
</html>
