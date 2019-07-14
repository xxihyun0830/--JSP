<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if(id.equals(pw)) {
		session.setAttribute("id", id);
		session.setAttribute("nickName", "짱구");
		response.sendRedirect("session_welcome.jsp");
	} else {	
%>
	<%-- HTML내부에 자바스크립트 코드를 사용하려면 <script>라는 태그를 사용함
		 alert는 브라우저에 경고창을 띄움 / history.go(-1) 뒤로가기 기능을 실행 --%>
	 <script>
	 	alert("로그인에 실패하셨습니다.");
	 	history.go(-1);
	 </script>
<%
	}
%>	 










