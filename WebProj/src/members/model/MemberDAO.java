package members.model;

import java.sql.*;
import java.util.*;
import util.ConnProvider;
import util.JdbcUtil;

public class MemberDAO { //Data Access Object
	
	//ȸ�� ���� ������ �ʿ��� ����� ����
	public static final int MEMBER_EXISTENT = 1;
	public static final int MEMBER_NONEXISTENT = 0;
	public static final int JOIN_SUCCESS = 1;
	public static final int JOIN_FAIL = 0;
	public static final int LOGIN_SUCCESS = 1;
	public static final int LOGIN_FAIL_PW = 0;
	public static final int LOGIN_FAIL_ID = -1;
	
	
	
	/*DAO ��ü�� �޸� heap ������ 1���� �����ص� �����ϱ� ������  singleton �����Ͽ� Ŭ������ ������ -> ��ü 1���� �����ǵ��� ��
	<�̱��� ����>
	1. �ٸ� Ŭ����(�ܺ�)���� ��ü�� ������ �� ���� ��: �����ڿ� private �ɱ�
	2. �ڱ� Ŭ���� ���ο��� ������ ��ü ����
	3. �ܺο��� ��ü ���� �䱸�� �� public �޼ҵ� ���ؼ� 2������ �̸� ����� �� ��ü�� return*/
	
	private static MemberDAO instance = new MemberDAO();
	
	private MemberDAO() {}

	public static MemberDAO getInstance() {
		return instance;
	}
	
	/*ȸ�� ���� ó�� �޼ҵ�*/
	public int insertMember(MemberVO vo) {
		
		int regNum = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into members (id, pw, name, email, address) values (?, ?, ?, ?, ?)";
		
		try {
			conn = ConnProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			pstmt.setString(5, vo.getAddress());
			
			int i = pstmt.executeUpdate();
			
			if (i == 1) {
				regNum = MemberDAO.JOIN_SUCCESS;
			} else {
				regNum = MemberDAO.JOIN_FAIL;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
		}
		
		return regNum;
	}
	
	/*�̹� ���Ե� ȸ������ �����ϴ� �޼ҵ�*/
	public int confirmId(String id) {
		
		int regNum = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select id from members where id = ?";
		
		try {
			conn = ConnProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) { //�� id�� ȸ�� ���� �̹� �Ǿ� �ִ� ���
				regNum = MemberDAO.MEMBER_EXISTENT;
			} else {
				regNum = MemberDAO.MEMBER_NONEXISTENT;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		
		return regNum;
	}
	
	/*�α��� ��ȿ�� ���� �޼ҵ�*/
	public int userCheck(String id, String pw) {
		int loginNum = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select pw from members where id = ?";
		
		try {
			conn = ConnProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) { //���ԵǾ� �ִ� ����� ���
				String dbPw = rs.getString("pw");
				if (dbPw.equals(pw)) {
					loginNum = MemberDAO.LOGIN_SUCCESS;
				} else {
					loginNum = MemberDAO.LOGIN_FAIL_PW;
				}
			} else { //���ԵǾ� ���� ���� ����� ���
				loginNum = MemberDAO.LOGIN_FAIL_ID;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		return loginNum;
	}
	
	//ȸ���� ������ �������� �޼ҵ�
	public MemberVO getMember(String id) {
		MemberVO vo = new MemberVO();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	      
		String sql = "select * from members where id=?";
	      
		try {
			conn = ConnProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if(rs.next()) {            
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw"));
	            vo.setName(rs.getString("name"));
	            vo.setEmail(rs.getString("email"));
	            vo.setAddress(rs.getString("address"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		} 
		return vo;
	}

	//��й�ȣ�� �����ϴ� �޼���
	public int changePassword(String id, String pw) {
		int updateNum = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
	      
		String sql = "update members set pw=? where id=?";
	      
		try {
			conn = ConnProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
	         
			pstmt.setString(1, pw);
			pstmt.setString(2, id);    
			updateNum = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
		}      
	      
		return updateNum;
	}
	
	//ȸ������ ������ ó���ϴ� �޼ҵ�
	public int updateMember(String email, String address, String id) {
		int updateNum = 0;
		      
		Connection conn = null;
		PreparedStatement pstmt = null;
		      
		String sql = "UPDATE MEMBERS SET EMAIL=?, ADDRESS=? WHERE ID=?";
		      
		try {
			conn = ConnProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
		         
			pstmt.setString(1, email);
			pstmt.setString(2, address);
			pstmt.setString(3, id);
		         
			updateNum = pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
		}
		return updateNum;
	}		
	
	//ȸ�� Ż�� ó�� �޼ҵ�
	public int deleteMember(String id) {
		
		int delNum = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "delete from members where id = ?";
		
		try {
			conn = ConnProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			delNum = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
		}
		return delNum;
	}
	
	//��ü ȸ�� ���� ��ȸ �޼ҵ�
	public ArrayList<MemberVO> membersAll() {
		
		ArrayList<MemberVO> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from members";
		
		try {
			conn = ConnProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setrDate(rs.getTimestamp("rDate"));
				vo.setAddress(rs.getString("address"));
				
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		return list;
	}
	
}