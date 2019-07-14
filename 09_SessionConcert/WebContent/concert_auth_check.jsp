<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String code = request.getParameter("code");
	String authCode = (String)session.getAttribute("authcode");
	
	if(code.equals(authCode)){
		session.setAttribute("auth", true);
		response.sendRedirect("concert_reserve.jsp");
	} else {
		out.println("<h1>인증 실패</h1>");
%>
	<a href = "concert_auth.jsp"> 다시 인증하기 </a>
<%
	}
%>