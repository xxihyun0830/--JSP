package test;
import java.sql.*;
import java.util.*;

public class JdbcDelete {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 회원의 ID를 입력하세요.");
		System.out.println(">");
		String id = scan.next();
		
		Connection conn = null;
		Statement stmt = null;
		
		String url = "jdbc:mysql://localhost:3306/practice";
		String uid = "jsp";
		String upw = "jsp";
		String sql = "delete from member where id = '" + id + "'";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			stmt = conn.createStatement();
			int i = stmt.executeUpdate(sql);
			
			if (i == 1) {
				System.out.println("회원 ID: " + id + "가 정상적으로 삭제되었습니다.");
			} else {
				System.out.println("Delete 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (scan != null) scan.close();
				if (conn != null) conn.close();
				if (stmt != null) stmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
