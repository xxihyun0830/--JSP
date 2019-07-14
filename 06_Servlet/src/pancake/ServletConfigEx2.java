package pancake;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns = { "/sic" }, 
		initParams = { 
				@WebInitParam(name = "id", value = "abc123"), 
				@WebInitParam(name = "pw", value = "zxc123")})


public class ServletConfigEx2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public ServletConfigEx2() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        System.out.println("doGet!");
        
        //getInitParameter(�ʱ�ȭ �Ķ���� name): ���� �ʱ�ȭ �Ķ���͸� ���� ��û �ÿ� ����ϴ� ��
        
        String id = getInitParameter("id");
        String pw = getInitParameter("pw");
        
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        
        out.println("<html><head></head><body>");
        out.println("���̵�: " + id + "<br>");
        out.println("��й�ȣ: " + pw + "<br>");
        out.println("</body></html>");
        }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}