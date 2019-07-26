package user.controller;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.SendResult;

import user.model.UserDAO;
import user.model.UserVO;


@WebServlet("/JoinOk")
public class JoinOk extends HttpServlet {
	private static final long serialVersionUID = 1L;

/*	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	
	private String name, id, pw, phone1, phone2, phone3, gender;
	
	private String url = "jdbc:mysql://localhost:3306/practice";
	private String uid = "jsp";
	private String upw = "jsp";*/
	
    public JoinOk() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String gender = request.getParameter("gender");
		
		UserVO vo = new UserVO(name, id, pw, phone1, phone2, phone3, gender);
		UserDAO dao = new UserDAO();
		int i = dao.join(vo);
		
		if (i == 1) {
			response.sendRedirect("join_result.jsp");
		} else {
			response.sendRedirect("join.jsp");
		}
		
		/*String query = "insert into users values('" + name + "', '" + id + "', '" + pw + "', '" + phone1 + "', '" + phone2 + "', '"+ phone3 + "', '" + gender + "')";*/
		/*String sql = "insert into users values (?, ? ,?, ?, ?, ?, ?)";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			stmt = conn.createStatement();
			int i = stmt.executeUpdate(query);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			pstmt.setString(3, pw);
			pstmt.setString(4, phone1);
			pstmt.setString(5, phone2);
			pstmt.setString(6, phone3);
			pstmt.setString(7, gender);
			
			int i = pstmt.executeUpdate();
			
			if (i == 1) {
				response.sendRedirect("join_result.jsp");
			} else {
				response.sendRedirect("join.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) conn.close();
				if (stmt != null) stmt.close();
				if (pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}*/
	}
}
