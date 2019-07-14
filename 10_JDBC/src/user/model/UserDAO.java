package user.model;
import java.sql.*;
import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDAO { //DB 접근 객체

	/*private String url = "jdbc:mysql://localhost:3306/practice";
	private String uid = "jsp";
	private String upw = "jsp";*/
	private DataSource ds;
	
	
	public UserDAO() {
		/*Connection Pool 호출 로직
		 xml 파일 호출하기 위해 Context 클래스 사용*/
		try {
			Context ct = new InitialContext();
			ds = (DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e){
			e.printStackTrace();
		}*/
	}
	
	/*Insert, select, update, delete 로직들을 DAO의 메소드로 선언*/
	
	
	// 모든 회원 정보를 출력하는 메소드	
	public ArrayList<UserVO> userSelectAll() {
		
		ArrayList<UserVO> userList = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			/*conn = DriverManager.getConnection(url, uid, upw);*/
			conn = ds.getConnection(); //Connection pool에 있는 객체 하나 가지고 와서 쓰는 것
			pstmt = conn.prepareStatement("select * from users");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString("name");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String phone1 = rs.getString("phone1");
				String phone2 = rs.getString("phone2");
				String phone3 = rs.getString("phone3");
				String gender = rs.getString("gender");
				
				UserVO vo = new UserVO(name, id, pw, phone1, phone2, phone3, gender);
				userList.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) conn.close();
				if (pstmt != null) pstmt.close();
				if (rs != null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return userList;
	}
	
	public int join(UserVO vo) {
		
		int num = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into users values (?,?,?,?,?,?,?)";
		
		try {
			/*conn = DriverManager.getConnection(url, uid, upw);*/
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getId());
			pstmt.setString(3, vo.getPw());
			pstmt.setString(4, vo.getPhone1());
			pstmt.setString(5, vo.getPhone2());
			pstmt.setString(6, vo.getPhone3());
			pstmt.setString(7, vo.getGender());
			
			num = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) conn.close();
				if (pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return num;
	}
}
