<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//getAttribute(세션 이름) : 세션의 데이터를 가져오는 메소드
	String id = (String)session.getAttribute("id");
	String name = (String)session.getAttribute("name");
	
	out.println("아이디: " + id + "<br>");
	out.println("이름: " + name + "<br>");
	out.println("=====================<br>");
	
	//세션의 유효시간은 Servers > web.xml 파일에 분 단위로 기술되어 있음
	//세션 객체의 setter 메소드를 통해서도 유효 시간 설정 가능
	//setter 메소드에 설정한 시간이 web.xml에 설정한 시간보다 우선 적용됨
	session.setMaxInactiveInterval(3600);
	int sTime = session.getMaxInactiveInterval(); //세션의 유효 시간을 초 단위로 리턴
	out.println("세션 유효시간: " + sTime + "<br>");
	out.println("=====================<br>");
	
	//특정 세션 데이터를 삭제하려면 removeAttribute(세션 이름)사용
	session.removeAttribute("name");
	name = (String)session.getAttribute("name");
	out.println("세션이름: " + name + "<br>");
	out.println("=====================<br>");
	
	//invalidate(): 모든 세션 무효화
	//session.invalidate();
	
	//isRequestedSessionIdValid(): 요청 세션 ID가 존재하는지의 여부를 boolean 타입으로 리턴
	if (request.isRequestedSessionIdValid()) {
		out.println("유효한 세션이 존재함.");
	} else {
		out.println("유효한 세션이 존재하지 않음.");
	}
%>