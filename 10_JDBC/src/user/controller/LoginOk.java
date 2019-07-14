package user.controller;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/LoginOk")
public class LoginOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private String id, pw, name;
	

    public LoginOk() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		
		/*String sql = "select * from users where id='" + id + "' and pw='" + pw + "'";*/
		String sql = "select * from users where id = ? and pw = ?";
		
		String url = "jdbc:mysql://localhost:3306/practice";
		String uid = "jsp";
		String upw = "jsp";
		
		Connection conn = null;
		/*Statement stmt = null;*/
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		HttpSession session = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, uid, upw);
			/*stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);*/
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				name = rs.getString("name");
				id = rs.getString("id");
			}
			
			session = request.getSession();
			
			session.setAttribute("name", name);
			session.setAttribute("id", id);
			
			response.sendRedirect("login_result.jsp");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) conn.close();
				/*if(stmt!=null) stmt.close();*/
				if (pstmt != null) pstmt.close();
				if (rs != null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}







