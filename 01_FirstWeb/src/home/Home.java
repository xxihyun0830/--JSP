package home;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/xxx")
//1. ���� ������ �Ƴ����̼� �̿��Ͽ� url ���� ����
//2. WebContent > WEB-INF > web.xml ������ ���� ����

public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L; //Hello Ŭ������ ����ȭ�� ��ü ����ȭ ��ȣ
       
    public Home() { //constructor �ڵ� ����
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
