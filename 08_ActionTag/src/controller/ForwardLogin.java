package controller;

import java.io.IOException;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ForwardLogin")
public class ForwardLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ForwardLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
	          
	    String id  =request.getParameter("id");  
	    String pw = request.getParameter("pw");  
	          
	    if(id.equals("jsp") && pw.equals("coding101")){  
	    	RequestDispatcher rd = request.getRequestDispatcher("/ForwardWelcome");  
	        rd.forward(request, response);  
	    }  
	    else{  
	    	out.print("ID or PW Error!");  
	    	RequestDispatcher rd = request.getRequestDispatcher("/forward_login.jsp");  
	    	rd.include(request, response);
	    }  
	}  
}
