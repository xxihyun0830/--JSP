<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if (id.equals("abc1234") && pw.equals("1234")){
		Cookie cookie = new Cookie("id", id);
		cookie.setMaxAge(5);
		response.addCookie(cookie);
		response.sendRedirect("cookie_welcome.jsp");
	} else {
		response.sendRedirect("cookie_login.jsp");
	}
%>