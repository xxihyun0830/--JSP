<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String idValue = request.getParameter("id");

	Connection conn = null;
	PreparedStatement pstmtItem = null;
	PreparedStatement pstmtDetail = null;
	
	Exception occur = null;
	
	String url = "jdbc:mysql://localhost:3306/practice";
	String uid = "jsp";
	String upw = "jsp";
	
	try {
		int id = Integer.parseInt(idValue);
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, uid, upw);
		
		/* 트랜잭션 시작 위해 자동 commit 하지 않도록 설정
		Connection 객체의 setAutoCommit()의 매개값을 false로 설정 */
		conn.setAutoCommit(false);
		
		pstmtItem = conn.prepareStatement("insert into item values (?, ?)");
		pstmtItem.setInt(1, id);
		pstmtItem.setString(2, "상품 이름: " + id);
		pstmtItem.executeUpdate();
		
		if (request.getParameter("error") != null) {
			throw new Exception("의도적 에러 발생"); //강제로 try 끝내고 catch로 바로 가도록 함
		}
		
		pstmtDetail = conn.prepareStatement("insert into item_detail values (?, ?)");
		pstmtDetail.setInt(1, id);
		pstmtDetail.setString(2, "상세 설명: " + id);
		pstmtDetail.executeUpdate();
		
		/* QUERY문 2개 모두 성공 시에만 commit */
		conn.commit(); //트랜잭션을 commit
		
	} catch (Exception e) { //중간에 에러 발생 시  트랜잭션을 rollback
		if (conn != null) {
			try {
				conn.rollback();
			} catch (Exception e2){
				e2.printStackTrace();
			}
			occur = e;
		}
	} finally {
		try {
			if (conn != null) conn.close();
			if (pstmtItem != null) pstmtItem.close();
			if (pstmtDetail != null) pstmtDetail.close();
		} catch (Exception e3) {
			e3.printStackTrace();
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
	<%
		if (occur != null) {
	%>
			에러가 발생했습니다: <%= occur.getMessage() %>
	<%
		} else {
	%>
			데이터가 성공적으로 처리되었습니다.
	<%
		}
	%>	

</body>
</html>