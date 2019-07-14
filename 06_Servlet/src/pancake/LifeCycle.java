package pancake;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class LifeCycle extends HttpServlet {
	
	private static final long serialVersionUID = -7001453595394020739L;


	public LifeCycle() {
	        System.out.println("서블릿 객체 생성!");
	    }
	   
	   public void init(ServletConfig config) throws ServletException {
	      System.out.println("init 메소드 호출!");
	      System.out.println("init 메소드는 서블릿이 생성될 때 최초 1회 호출됩니다.");
	      System.out.println("init 메소드에는 해당 페이지가 실행될 때, 초기에 실행할 로직이 있다면 이곳에 기술합니다.");
	   }

	   
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      System.out.println("doGet 호출!");
	      System.out.println("get 요청이 왔을 시에 요청 시마다 호출됩니다.");
	   }

	   
	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      System.out.println("doPost 호출!");
	      System.out.println("post 요청이 왔을 시에 요청 시마다 호출됩니다.");
	   }
	   
	   
	   public void destroy() {
		      System.out.println("destroy 메소드 호출!");
		      System.out.println("destroy 메소드는 서블릿 객체가 소멸될 때 1회 호출됩니다.");
		      System.out.println("페이지가 끝날 때 해제할 자원 코드가 있다면 이곳에 기술합니다.");
		   }

}
