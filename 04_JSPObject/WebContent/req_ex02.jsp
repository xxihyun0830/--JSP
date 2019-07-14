<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String strCm = request.getParameter("cm");
	//Integer.parseInt(strCm) => int형으로 치환
	//Double.parseDouble(strCm) => double형으로 치환
	double cm = Double.parseDouble(strCm);
	double kg = Double.parseDouble(request.getParameter("kg"));
	double bmi = kg / (cm/100 * cm/100);
	
/* 	String을 기본 데이터 타입으로 치환하는 방법
	String str1 = "10";
	String str2 = "20";
	str1 * str2 가 안 됨 -> int로 바꿔 줘야 함 => 이때 Integer라는 Wrapper Class를 사용 :Integer.parseInt(str1); Integer.parseInt(str2);
	cf) parseInt()는 static 메소드이기 때문에 바로 Integer class 접근 가능한 것! 
	Double로 바꾸려면 : Double.parseDouble(str1) => 10.0
	*/
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>체질량 지수 계산</h2>
	<hr>
	
	<p>
	 	- 키: <%= cm %> <br>
	 	- 몸무게: <%= kg %> <br>
	</p>
	
	<p>
		- BMI 지수: <b><%= bmi %></b> <br>
		<% if (bmi < 18.5){ %>
			당신은 저체중입니다.
		<% } else if (bmi > 23.0) { %>
        	 당신은 과체중입니다.
     	<% } else { %>
         	당신은 정상체중입니다.
      	<% } %>         

	</p>

</body>
</html>