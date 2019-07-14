package test;
import java.sql.*;

public class JdbcSelect {
	public static void main(String[] args) {
		
		//SELECT 쿼리 가동 위한 JDBC 프로그래밍, try-catch 블록 밖에서 선언
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/practice";
		String uid = "jsp";
		String upw = "jsp";
		String sql = "select * from member";
		
		/*sql 패키지의 객체들을 생성할 때는 모든 메소드들이 throws SQLException이 있기 때문에
		반드시 try-catch 블록 내부에서 객체 생성해야 함*/
		try {
			 //JDBC 드라이버 호출, API 사용 준비
			Class.forName("com.mysql.jdbc.Driver");
			
			/*DB와의 연결을 위해 Connection 객체 생성
			Connection 객체는 DriverManager라는 클래스의  getConnection() 스태틱 메소드를 호출하여 생성*/
			conn = DriverManager.getConnection(url, uid, upw);
			
			/*SQL 쿼리문 실행 위한 Statement 객체 생성
			Statement 객체는 Connection 객체를 통해서 createStatement() 메소드를 호출하여 생성*/
			stmt = conn.createStatement();
			
			/*SQL 쿼리문 실행
			- SELECT 쿼리일 경우: executeQuery() 호출
			- INSERT, UPDATEM DELETE 쿼리일 경우: executeUpdate() 호출*/
			rs = stmt.executeQuery(sql);
			//
			while(rs.next()) { //SELECT 결과 데이터 행이 하나라도 존재하는지 Boolean 타입으로 return
				/*SELECT 실행문의 결과를 읽어 오려면 getString(), getInt() 등의 메소드를 사용
				 매개값으로는 읽어 올 테이블의 컬럼명 적어 줌*/
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
			e.printStackTrace(); //에러 경로 표시, 프로그램 안 터짐
		} finally { //예외 발생 유무와 관계없이 무조건 실행하는 부분
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