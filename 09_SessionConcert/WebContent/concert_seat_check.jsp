<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<String> list = new ArrayList<>(); //데이터 순차적 관리 BUT 중복 저장 허용
	
	if (application.getAttribute("list") != null){
		//application 객체에 list 있으면 이미 예매된 좌석들 있다는 것이므로 초기화된 빈 list를 예매된 좌석들 있는 list로 바꿈
		list = (List<String>)application.getAttribute("list"); //(예매된 좌석들)
	}
	
	String[] seat = request.getParameterValues("seat");
	//checkbox는 여러 개 오므로 getParameter말고 getParameterValues 사용하여 리스트에 담기 (선택한 좌석 전체 담음)
	
	int cnt = 0;
	List<String> tempList = new ArrayList<>();
	
	for(String s : seat) { //검사 1: 선택한 좌석(들)이 이미 예매가 되었는지 확인
		if (list.contains(s)) { // (이미 예매된 좌석인지 확인 -> 예매된 좌석일 경우)
			break;
		} else { // (예매된 좌석 아닐 경우)
			tempList.add(s);
			cnt++;
		}
	}
	
	if (cnt == seat.length)	{ //검사 2: 선택한 좌석들 중 이미 예약된 좌석이 하나라도 있을 경우, 전체 취소시키기 OR 전부 빈 좌석이면 list에 tempList에 있는 것 다 담기
		list.addAll(tempList);
	}
	
	application.setAttribute("list", list); //서버 돌아가는 이상, 브라우저 꺼져도 저장되도록 application 객체에 저장
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align = "center">
		<h2>콘서트 예약 처리 결과</h2>
		<hr>
		<p>
			선택한 좌석 <br>
			<%
				for(String s : seat) {
					out.println("<b>[" + s + "]</b>");
				}
			%>
			<br>예약 신청 되었습니다.
		</p>
		
		<p>
			예약 신청 결과: <%= (cnt == seat.length)?"성공":"실패" %>
			<br>
			<%
				if (cnt != seat.length) {
			%>
					예약하고자 하는 좌석이 이미 선점되었습니다.
			<%
				}
			%>
		</p>
		
		<a href = "concert_reserve.jsp">다시 예약하기</a>
	
	</div>
</body>
</html>