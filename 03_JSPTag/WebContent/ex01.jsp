<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
	int total = 0; //전역 변수 total (페이지 요청 횟수 저장)
	
	int luckyNumber() { //전역 메소드
		int i = (int)(Math.random() * 10) + 1; //random은 double로 return됨 (0.0이상 1.0미만) -> int 캐스팅하면 0부터 9까지
		return i;
	}
	
	String luckyColor() { //전역 메소드
		double d = Math.random();
		
		if (d > 0.6) {
			return "검정색";
		} else if (d > 0.3){
			return "빨간색";
		} else {
			return "파란색";
		}
	}

%>
   
<%
	String str = "JSP 태그 연습";
	int j = 0; //지역 변수 j -> scriptlet 실행 종료 시 변수 값 초기화
	total++;
	j++;

	int randomNum = luckyNumber();
	String randomCol = luckyColor();
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1><%= str %></h1>

	<!-- p태그는 문단을 나누는 태그 -->
	<p>
		두 변수가 선언된 태그에 따라 값의 변화를 확인해 보세요  <br>
		전체 요청 횟수: <%= total %>, 지역 변수 j의 값 : <%= j %>
	</p>
	
	<hr>
	
	<p>
		<h2>오늘의 운세</h2>
	</p>
	
	<p>
		오늘의 행운의 숫자는 <b><%= randomNum %></b>이고,
		행운의 색깔은 <i><%= randomCol%></i>입니다.
	</p>

</body>
</html>