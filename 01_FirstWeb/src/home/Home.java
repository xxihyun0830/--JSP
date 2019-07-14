package home;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/xxx")
//1. 서블릿 내에서 아노테이션 이용하여 url 매핑 가능
//2. WebContent > WEB-INF > web.xml 내에서 변경 가능

public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L; //Hello 클래스의 고유화된 객체 직렬화 번호
       
    public Home() { //constructor 자동 생성
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld!");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
