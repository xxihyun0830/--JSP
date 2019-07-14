<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%-- 페이지 디렉티브의 include 기능은 페이지 전역에 사용할 변수와 메소드가 있을 때 사용 ex) <%@ include file = "삽입할 페이지" %> 
		 action 태그의 include 기능은 단순히 UI(디자인)만 복사하여 적용시키고 싶을 때 사용 ex) <jsp:include page = "삽입할 페이지"--%>
	
	<h1>include01 메인 바디 부분입니다.</h1>
	
	<jsp:include page="include_ex02.jsp"/>
	
	<h3>다시 include01 페이지의 내용입니다.</h3>

</body>
</html>