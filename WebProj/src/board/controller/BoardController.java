package board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.service.BoardContentService;
import board.service.BoardListService;
import board.service.BoardWriteService;
import board.service.IBoardService;

@WebServlet("*.board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BoardController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}

	private void doRequest(HttpServletRequest request, HttpServletResponse response )throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		IBoardService service = null;
		String view = null;
		
		String uri = request.getRequestURI();
		System.out.println(uri);
		String conPath = request.getContextPath();
		System.out.println(conPath);
		String com = uri.substring(conPath.length());
		System.out.println(com);

		
		if(com.equals("/board/list.board")) { 
			//1. �޴��ǿ� Board�� Ŭ���� ��� �����
			//�޴��ٿ��� Board�� ������ ���� �����۸�ũ�� /board/list.board/ �̴�. 
			//include/header.jsp���� Ȯ���ϸ� �˴ϴ�.
			// ��, �޴��ٿ��� board�� Ŭ���ϴ� ���, �� if������ ����ȴ�. 
			service = new BoardListService();
			service.executeService(request, response);
			view = "/board/board_list.jsp";
			
		} else if(com.equals("/board/write_view.board")) {
			//2. �Խ��� ȭ�鿡�� [write]�� Ŭ���� ��� �����
			//    2-1. �Խ��� �ۼ� ȭ�� ������
			
			//board_list.jsp ���� �ȿ��� [write] �� Ŭ���ϸ� 
			// �Ѿ�� �����۸�ũ�� /board/write_view.board �̴�.
			view = "/board/write_view.jsp";
			
		} else if(com.equals("/board/write.board")) {
			//3. 2������ �Խ��� ���� �ۼ��� ������ [�Ϸ�] Ŭ�� �� �����
			//  3-1. �Խ��� ù ȭ���� ������
			
			//write_view.jsp �ȿ��� form�±� �ȿ� action���� ������ �� write.board�̴�.
			//write_view.jsp ���Ͽ� �Խ��� �ۼ��� �ϸ� �ۼ� ������ /board/write.board ��ũ�� ���޵ȴ�.
			// ���޵� ������ DB�� ���� ������ Controller�� ���ľ� ��. �� ���� ��ũ�� Ÿ�� ���޵� ������ 
			// �� else if ������ ������ ����
			service = new BoardWriteService();
			service.executeService(request, response);
			view = "/board/list.board";
			
		} else if(com.equals("/board/content_view.board")) {
			//board_list.jsp���� 2��° ���� ���� �߿��� content_view.board�� bId�� ��� ���� ��ũ�� Ÿ��
			//controller��  �Ѿ���� �ȴ�.
			
			service = new BoardContentService();
			service.executeService(request, response);
			view = "/board/content_view.jsp";
		}
		
		RequestDispatcher dp = request.getRequestDispatcher(view);
		 // view�� mapping�Ǿ��ִ� ������ ("*.board")�� ȣ��ȴ�.
		dp.forward(request, response);
		
	}
}
