package board.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDAO;
import board.model.BoardVO;

public class BoardListService implements IBoardService {

	@Override
	public void executeService(HttpServletRequest request, HttpServletResponse response) {
		
		BoardDAO dao = BoardDAO.getInstance();
		ArrayList<BoardVO> list = dao.getList();
		request.setAttribute("board_list", list);
	}

}