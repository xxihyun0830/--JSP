<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//chrome F12 개발자 도구 > Network 보면 res_take.jsp를 거쳐서 감을 알 수 있음
	
	String strAge = request.getParameter("age");
	int age = Integer.parseInt(strAge);
	
	if (age >= 20) {
		response.sendRedirect("res_ok.jsp"); //sendRedirect(URL) - url 주소 적기
	} else {
		response.sendRedirect("res_no.jsp");
	}
%>