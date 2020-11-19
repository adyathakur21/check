package com.lti.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

public class LoginServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		RequestDispatcher rd = null;
		if(uname.equals("root") && pwd.equals("123")){
			rd = request.getRequestDispatcher("success.html");
			rd.forward(request,response);
		}
		else{
			rd = request.getRequestDispatcher("failure.html");
			rd.forward(request,response);
		}
	}

}