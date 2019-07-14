<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 이 페이지에서는 넘어온 아이디 값과 비밀번호 값을 받아서 처리함
	 만약 아이디가 abc1234이고 비밀번호가 xyz9876이라면
	 아이디가 일치하지 않았을 경우: 'res_id_fail.jsp'로 리다이렉팅하여 존재하지 않는 회원입니다를 브라우저에 출력
	 아이디가 일치할 경우 비밀번호도 확인하여 틀렸을 경우: 'jsp_pw_fail.jsp'로 리다이렉팅하여 비밀번호가 틀렸습니다 출력
	 둘 다 일치할 경우 'res_welcome.jsp'로 리다이렉팅하여 회원님 반갑습니다 출력 --%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	if(id.equals("abc1234")) {
	      if(pw.equals("xyz9876")) {
	         response.sendRedirect("res_welcome.jsp");
	      } else {
	         response.sendRedirect("res_pw_fail.jsp");
	      }
	   } else {
	      response.sendRedirect("res_id_fail.jsp");
	   }
%>