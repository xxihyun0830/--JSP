<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String name, id, pw, phone1, phone2, phone3, gender;	
%>
<%
	id = (String) session.getAttribute("id");
	
	String url = "jdbc:mysql://localhost:3306/practice";
	String uid = "jsp";
	String upw = "jsp";
	
	String sql = "select * from users where id='" + id + "'";
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, uid, upw);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		if(rs.next()) {
			name = rs.getString("name");
			phone2 = rs.getString("phone2");
			phone3 = rs.getString("phone3");
			gender = rs.getString("gender");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (conn != null) conn.close();
			if (stmt != null) stmt.close();
			if (rs != null) rs.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="UpdateOk" method="post">
		이름: <%= name %><br>
		아이디: <%= id %><br>
		전화번호:
		<select name="phone1">
			<option value="010">010</option>
			<option value="011">011</option>
			<option value="016">016</option>
			<option value="019">019</option>
		</select> -
		<%-- input 태그에 특정값을 넣으려면 value 속성을 이용함 --%>
		<input type="text" name="phone2" size="5" value="<%=phone2 %>"> -
		<input type="text" name="phone3" size="5" value="<%=phone3 %>"> <br>
		
		성별:
		<%
			if(gender.equals("남")) {
		%>
		<%-- checked: 라디오 버튼이나 체크 박스 버튼에 미리 체크가 되어있게 하는 속성 --%>
		<input type="radio" name="gender" value="남" checked>남&nbsp;
		<input type="radio" name="gender" value="여">여 <br>
		<%
			} else {
		%>
		<input type="radio" name="gender" value="남">남&nbsp;
		<input type="radio" name="gender" value="여" checked>여 <br>
		<%} %>
		
		<input type="submit" value="정보 수정">
	</form>
</body>
</html>