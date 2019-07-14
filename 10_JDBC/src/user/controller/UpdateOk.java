package user.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/UpdateOk")
public class UpdateOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String id, phone1, phone2, phone3, gender;
       

    public UpdateOk() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		
		id = (String) session.getAttribute("id");
		phone1 = request.getParameter("phone1");
		phone2 = request.getParameter("phone2");
		phone3 = request.getParameter("phone3");
		gender = request.getParameter("gender");
		
		String url = "jdbc:mysql://localhost:3306/practice";
		String uid = "jsp";
		String upw = "jsp";
		
		Connection conn = null;
		/*Statement stmt = null;*/
		PreparedStatement pstmt = null;
		
		/*String sql = "update users set phone1='" + phone1 + "', phone2='" + phone2 + "', phone3='" + phone3 + "', gender='" + gender + "' where id='" + id + "'";*/
		String sql = "update users set phone1=? , phone2=?, phone3=?, gender=? where id=?";

		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, uid, upw);
			/*stmt = conn.createStatement();
			int i = stmt.executeUpdate(sql);*/
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phone1);
			pstmt.setString(2, phone2);
			pstmt.setString(3, phone3);
			pstmt.setString(4, gender);
			pstmt.setString(5, id);
			int i = pstmt.executeUpdate();
			
			
			if(i == 1) {
				response.sendRedirect("update_result.jsp");
			}else {
				response.sendRedirect("update.jsp");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) conn.close();
				/*if(stmt!=null) stmt.close();*/
				if(pstmt!=null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}






