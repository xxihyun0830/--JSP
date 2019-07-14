package user.controller;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DeleteOk
 */
@WebServlet("/DeleteOk")
public class DeleteOk extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteOk() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		
		String url = "jdbc:mysql://localhost:3306/practice";
		String uid = "jsp";
		String upw = "jsp";
		/*String sql = "delete from users where id = '" + id + "'";*/
		String sql = "delete from users where id = ?";
		
		Connection conn = null;
		/*Statement stmt = null;*/
		PreparedStatement pstmt = null;
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, uid, upw);
			/*stmt = conn.createStatement();
			int i = stmt.executeUpdate(sql);*/
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			int i = pstmt.executeUpdate();
			
			if (i == 1) {
				session.invalidate();
				response.sendRedirect("delete_result.jsp");
			} else {
				response.sendRedirect("login_result.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) conn.close();
				/*if (stmt != null) stmt.close();*/
				if (pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
