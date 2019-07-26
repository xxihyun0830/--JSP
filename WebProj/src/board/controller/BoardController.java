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
			//1. 메뉴판에 Board를 클릭할 경우 실행됨
			//메뉴바에서 Board를 선택할 떄의 하이퍼링크가 /board/list.board/ 이다. 
			//include/header.jsp에서 확인하면 됩니다.
			// 즉, 메뉴바에서 board를 클릭하는 경우, 이 if구문이 실행된다. 
			service = new BoardListService();
			service.executeService(request, response);
			view = "/board/board_list.jsp";
			
		} else if(com.equals("/board/write_view.board")) {
			//2. 게시판 화면에서 [write]를 클릭할 경우 실행됨
			//    2-1. 게시판 작성 화면 보여줌
			
			//board_list.jsp 파일 안에서 [write] 를 클릭하면 
			// 넘어가는 하이퍼링크가 /board/write_view.board 이다.
			view = "/board/write_view.jsp";
			
		} else if(com.equals("/board/write.board")) {
			//3. 2번에서 게시판 내용 작성를 끝내고 [완료] 클릭 시 실행됨
			//  3-1. 게시판 첫 화면을 보여줌
			
			//write_view.jsp 안에서 form태그 안에 action으로 보내는 게 write.board이다.
			//write_view.jsp 파일에 게시판 작성을 하면 작성 내용이 /board/write.board 링크로 전달된다.
			// 전달된 정보는 DB로 들어가기 때문에 Controller를 거쳐야 함. 즉 위의 링크를 타고 전달된 정보가 
			// 이 else if 구문을 돌리는 거임
			service = new BoardWriteService();
			service.executeService(request, response);
			view = "/board/list.board";
			
		} else if(com.equals("/board/content_view.board")) {
			//board_list.jsp에서 2번째 행의 내용 중에서 content_view.board에 bId가 묻어서 가는 링크를 타고
			//controller로  넘어오면 된다.
			
			service = new BoardContentService();
			service.executeService(request, response);
			view = "/board/content_view.jsp";
		}
		
		RequestDispatcher dp = request.getRequestDispatcher(view);
		 // view에 mapping되어있는 서블릿인 ("*.board")이 호출된다.
		dp.forward(request, response);
		
	}
}
