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
		out.println("이름: " + name + "<br>");
		out.println("아이디: " + id + "<br>");
		out.println("패스워드: " + pw + "<br>");
		out.println("취미: " + Arrays.toString(hobbies) + "<br>");
		out.println("전공: " + major + "<br>");
		out.println("지역: " + region + "<br>");
		out.println("</body>");
		out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8"); //서버에서 한글 처리
		
		System.out.println("doPost!");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String [] hobbies = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String region = request.getParameter("region");
		
		
		//서블릿에서 html 코드 사용 방법
		//응답 시 어떤 형식으로 응답할 것인지 문서 타입을 정의
		response.setContentType("text/html; charset = UTF-8");
		
		//자바 클래스에 html 코드 작성 위해서는 PrintWriter 클래스 사용
		// import java.io.PrintWriter ; 해야 함
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("이름: " + name + "<br>");
		out.println("아이디: " + id + "<br>");
		out.println("패스워드: " + pw + "<br>");
		out.println("취미: " + Arrays.toString(hobbies) + "<br>");
		out.println("전공: " + major + "<br>");
		out.println("지역: " + region + "<br>");
		out.println("</body>");
		out.println("</html>");
		
	}
}


//client가 가입 버튼 누름 -> server에 request하고, server는 JoinOK 서블릿에서 doPost() 호출함
//HttpServletRequest 클래스의 메소드 getParameter("") - "매개값으로 데려올 폼 데이터의 name 속성을 문자열 형태로 입력"


