package test;
import java.sql.*;

public class JdbcSelect {
	public static void main(String[] args) {
		
		//SELECT ���� ���� ���� JDBC ���α׷���, try-catch ��� �ۿ��� ����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/practice";
		String uid = "jsp";
		String upw = "jsp";
		String sql = "select * from member";
		
		/*sql ��Ű���� ��ü���� ������ ���� ��� �޼ҵ���� throws SQLException�� �ֱ� ������
		�ݵ�� try-catch ��� ���ο��� ��ü �����ؾ� ��*/
		try {
			 //JDBC ����̹� ȣ��, API ��� �غ�
			Class.forName("com.mysql.jdbc.Driver");
			
			/*DB���� ������ ���� Connection ��ü ����
			Connection ��ü�� DriverManager��� Ŭ������  getConnection() ����ƽ �޼ҵ带 ȣ���Ͽ� ����*/
			conn = DriverManager.getConnection(url, uid, upw);
			
			/*SQL ������ ���� ���� Statement ��ü ����
			Statement ��ü�� Connection ��ü�� ���ؼ� createStatement() �޼ҵ带 ȣ���Ͽ� ����*/
			stmt = conn.createStatement();
			
			/*SQL ������ ����
			- SELECT ������ ���: executeQuery() ȣ��
			- INSERT, UPDATEM DELETE ������ ���: executeUpdate() ȣ��*/
			rs = stmt.executeQuery(sql);
			//
			while(rs.next()) { //SELECT ��� ������ ���� �ϳ��� �����ϴ��� Boolean Ÿ������ return
				/*SELECT ���๮�� ����� �о� ������ getString(), getInt() ���� �޼ҵ带 ���
				 �Ű������δ� �о� �� ���̺��� �÷��� ���� ��*/
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				
				System.out.println("NAME: " + name);
				System.out.println("ID: " + id);
				System.out.println("PW: " + pw);
				System.out.println("EMAIL: " + email);
				System.out.println("");
			}
			
		} catch (Exception e) {
			e.printStackTrace(); //���� ��� ǥ��, ���α׷� �� ����
		} finally { //���� �߻� ������ ������� ������ �����ϴ� �κ�
			try {
				if (conn != null) conn.close();
				if (stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}