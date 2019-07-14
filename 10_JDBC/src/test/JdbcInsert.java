package test;
import java.sql.*;
import java.util.*;

public class JdbcInsert {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��� �����մϴ�.");
		
		System.out.println("�̸�: ");
		String name = scan.next();
		
		System.out.println("���̵�: ");
		String id = scan.next();
		
		System.out.println("��й�ȣ: ");
		String pw = scan.next();
		
		System.out.println("�̸���: ");
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
			int i = stmt.executeUpdate(sql); //QUERY�� ���� ���� ���� �� 1 return, ���� �� 0 return
			
			if (i == 1) {
				System.out.println("Insert ����!");
			} else {
				System.out.println("Insert ����!");
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
