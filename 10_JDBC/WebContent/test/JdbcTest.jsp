<%@ page import = "java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! //전역 변수로 선언
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/practice";
	String uid = "jsp";
	String upw = "jsp";
	String sql = "select * from member";
%>

<%
	try {
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url, uid, upw);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String email = rs.getString("email");
			
			out.println("아이디 : " + id + " 비밀번호 : " + pw + " 이름 : " + name + " 이메일: " + email + "<br />");

		}
	} catch (Exception e){
		e.printStackTrace();
	} finally {
		try {
			 if(rs != null) rs.close();
	         if(stmt != null) stmt.close();
	         if(conn != null) conn.close();
		} catch (Exception e2){
			e2.printStackTrace();
		}
	}
%>

</body>
</html>