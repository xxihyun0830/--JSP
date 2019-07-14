package login;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/JoinOk")

public class JoinOk extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public JoinOk() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet!");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String [] hobbies = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String region = request.getParameter("region");

		response.setContentType("text/html; charset = UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("�̸�: " + name + "<br>");
		out.println("���̵�: " + id + "<br>");
		out.println("�н�����: " + pw + "<br>");
		out.println("���: " + Arrays.toString(hobbies) + "<br>");
		out.println("����: " + major + "<br>");
		out.println("����: " + region + "<br>");
		out.println("</body>");
		out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8"); //�������� �ѱ� ó��
		
		System.out.println("doPost!");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String [] hobbies = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String region = request.getParameter("region");
		
		
		//�������� html �ڵ� ��� ���
		//���� �� � �������� ������ ������ ���� Ÿ���� ����
		response.setContentType("text/html; charset = UTF-8");
		
		//�ڹ� Ŭ������ html �ڵ� �ۼ� ���ؼ��� PrintWriter Ŭ���� ���
		// import java.io.PrintWriter ; �ؾ� ��
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("�̸�: " + name + "<br>");
		out.println("���̵�: " + id + "<br>");
		out.println("�н�����: " + pw + "<br>");
		out.println("���: " + Arrays.toString(hobbies) + "<br>");
		out.println("����: " + major + "<br>");
		out.println("����: " + region + "<br>");
		out.println("</body>");
		out.println("</html>");
		
	}
}


//client�� ���� ��ư ���� -> server�� request�ϰ�, server�� JoinOK �������� doPost() ȣ����
//HttpServletRequest Ŭ������ �޼ҵ� getParameter("") - "�Ű������� ������ �� �������� name �Ӽ��� ���ڿ� ���·� �Է�"


