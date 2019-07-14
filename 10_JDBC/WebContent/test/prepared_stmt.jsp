<%@ page import = "java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	String url = "jdbc:mysql://localhost:3306/practice";
	String uid = "jsp";
	String upw = "jsp";
	
	String sql = "insert into member values (?, ?, ?, ?)";
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, uid, upw);
		/* pstmt 객체는 Connection 객체를 통해 prepareStatement(sql)라는 메소드를 호출함
		매개값에 sql문 입력 */
		pstmt = conn.prepareStatement(sql);
		/* pstmt 객체 만들었으면 해당 객체를 통해 ?값 채워 줌 
		setString(), setInt() 메소드 사용하여 ?값 입력함*/
		pstmt.setString(1, "abc123");
		pstmt.setString(2, "1234");
		pstmt.setString(3, "홍길동");
		pstmt.setString(4, "abc@abc.com");
		/* ?값 입력 완료했다면 QUERY문에 따라 executeQuery(), executeUpdate() 호출*/		
		pstmt.executeUpdate();
		
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		try{
			if (conn != null) conn.close();
			if (pstmt != null) pstmt.close();
		} catch(Exception e2){
			e2.printStackTrace();
		}
	}
%>
   