package test;
import java.sql.*;
import java.util.*;

public class JdbcDelete {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ȸ���� ID�� �Է��ϼ���.");
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
				System.out.println("ȸ�� ID: " + id + "�� ���������� �����Ǿ����ϴ�.");
			} else {
				System.out.println("Delete ����");
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
