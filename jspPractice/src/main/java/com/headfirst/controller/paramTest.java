package com.headfirst.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class paramTest extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		//String email = getServletConfig().getInitParameter("adminEmail");
		//ServletContext context = getServletConfig().getServletContext();
		Enumeration<?> enumeration = getServletConfig().getInitParameterNames();
		
		
		out.println("<html><head></head><body>");
		while(enumeration.hasMoreElements()) {
			out.println(enumeration.nextElement());
			out.println("<br/>");
		}
		out.println("</body></html>");
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		out.println("<html>in doPost</html>");
	}
}
