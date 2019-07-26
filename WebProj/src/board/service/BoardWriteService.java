package board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDAO;

public class BoardWriteService implements IBoardService {

	@Override
	public void executeService(HttpServletRequest request, HttpServletResponse response) {
/*		controller에게 위임받은 요청 처리 수행
		폼 데이터에 넘어온 값들 처리 후 DAO 연결*/
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		BoardDAO dao = BoardDAO.getInstance();
		dao.write(bName, bTitle, bContent);
	}
}