package com.zzu.Code;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginAction extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)
			throws IOException,ServletException{
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 String validationCode = request.getParameter("validationCode");
		 String Code = (String) request.getSession().getAttribute("validationCode");
		 if(Code.equals(validationCode)){
			 response.sendRedirect(request.getContextPath()+"/emplist.jsp");
		 }else{
			 response.sendRedirect(request.getContextPath()+"/login.jsp");
		 }
		 
		 
		 
		 
		 
	}
}
