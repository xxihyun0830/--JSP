package board.model;

import java.sql.*;
import java.util.*;

import util.ConnProvider;
import util.JdbcUtil;

public class BoardDAO { //singleton
	
	private static BoardDAO instance = new BoardDAO();
	
	private BoardDAO( ) {}
	
	public static BoardDAO getInstance() {
		if(instance != null) {
			return instance;
		}
		return instance;
	}
	
	//게시판 글들의 정보를 DB로부터 불러올 메소드
	public ArrayList<BoardVO> getList(){
		ArrayList<BoardVO> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from board order by board_id desc";
		
		try {
			conn = ConnProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int bId = rs.getInt("board_id");
				String bName = rs.getString("board_name");
				String bTitle = rs.getString("board_title");
				String bContent = rs.getString("board_content");
				Timestamp bDate = rs.getTimestamp("board_date");
				int bHit = rs.getInt("board_hit");
				
				BoardVO vo = new BoardVO(bId, bName, bTitle, bContent, bDate, bHit);
				
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
	
	//글쓰기 요청에 대한 내용을 DB에 저장하는 메소드
	public void write(String bName, String bTitle, String bContent) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into board (board_name, board_title, board_content) values (?,?,?)";
		
		try {
			conn = ConnProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, bName);
			pstmt.setString(2, bTitle);
			pstmt.setString(3, bContent);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
		}
	}
	
	//게시글 내용 확인 메소드
	public BoardVO contentView(String strId) {
		
		upHit(strId);
		
		BoardVO vo = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from board where board_id = ?";
		
		try {
			conn = ConnProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(strId));
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int bId = rs.getInt("board_id");
				String bName = rs.getString("board_name");
				String bTitle = rs.getString("board_title");
				String bContent = rs.getString("board_content");
				Timestamp bDate = rs.getTimestamp("board_date");
				int bHit = rs.getInt("board_hit");
				
				vo = new BoardVO(bId, bName, bTitle, bContent, bDate, bHit);
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
	
	private void upHit(String strId) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "update board set board_hit = board_hit + 1 "
							+ "where board_id=?";

		try {
			conn = ConnProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(strId));

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
		}
	}

}
