package test;
import java.sql.*;
import java.util.*;

public class JdbcInsert {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정보 입력을 시작합니다.");
		
		System.out.println("이름: ");
		String name = scan.next();
		
		System.out.println("아이디: ");
		String id = scan.next();
		
		System.out.println("비밀번호: ");
		String pw = scan.next();
		
		System.out.println("이메일: ");
		String email = scan.next();
		
		Connection conn = null;
		Statement stmt = null;
		
		String url = "jdbc:mysql://localhost:3306/practice";
		String uid = "jsp";
		String upw = "jsp";
		String sql = "insert into member values " + "('" + id + "', '" + pw + "', '" + name + "', '" + email + "')";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			stmt = conn.createStatement();
			int i = stmt.executeUpdate(sql); //QUERY문 정상 실행 됐을 시 1 return, 실패 시 0 return
			
			if (i == 1) {
				System.out.println("Insert 성공!");
			} else {
				System.out.println("Insert 실패!");
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
