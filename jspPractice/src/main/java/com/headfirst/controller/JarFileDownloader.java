package com.headfirst.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JarFileDownloader extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int read = 0;
		
		response.setContentType("application/jar");
		ServletContext servletContext = getServletContext();
		
		InputStream is = servletContext.getResourceAsStream("/jar/commons-io-1.4.jar");
		
		if ( is == null ) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><head></head><body>");
			out.println("<h1>InputStream is NULL!!!!!!</h1>");
			out.println("</body></html>");
		} else {
			OutputStream os = response.getOutputStream();
			byte[] bytes = new byte[1024];
			
			while ( ( read = is.read(bytes)) != -1 ) {
				os.write(bytes, 0, read);
			}
			os.flush();
		}
	}
}
