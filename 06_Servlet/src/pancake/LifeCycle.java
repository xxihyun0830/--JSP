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
	        System.out.println("���� ��ü ����!");
	    }
	   
	   public void init(ServletConfig config) throws ServletException {
	      System.out.println("init �޼ҵ� ȣ��!");
	      System.out.println("init �޼ҵ�� ������ ������ �� ���� 1ȸ ȣ��˴ϴ�.");
	      System.out.println("init �޼ҵ忡�� �ش� �������� ����� ��, �ʱ⿡ ������ ������ �ִٸ� �̰��� ����մϴ�.");
	   }

	   
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      System.out.println("doGet ȣ��!");
	      System.out.println("get ��û�� ���� �ÿ� ��û �ø��� ȣ��˴ϴ�.");
	   }

	   
	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      System.out.println("doPost ȣ��!");
	      System.out.println("post ��û�� ���� �ÿ� ��û �ø��� ȣ��˴ϴ�.");
	   }
	   
	   
	   public void destroy() {
		      System.out.println("destroy �޼ҵ� ȣ��!");
		      System.out.println("destroy �޼ҵ�� ���� ��ü�� �Ҹ�� �� 1ȸ ȣ��˴ϴ�.");
		      System.out.println("�������� ���� �� ������ �ڿ� �ڵ尡 �ִٸ� �̰��� ����մϴ�.");
		   }

}
