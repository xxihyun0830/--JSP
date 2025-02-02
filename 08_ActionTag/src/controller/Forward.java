package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Forward")
public class Forward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Forward() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("id", "abc123");
		request.setAttribute("pw", "12345");
		
		//forward의 원형 클래스는 RequestDispatcher 클래스
		RequestDispatcher dp = request.getRequestDispatcher("/forward_test.jsp");
		dp.forward(request, response); //데이터가 유지됨
	}

}
