package com.headfirst.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.headfirst.model.Dog;

public class ListenerTester extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("Test Context Attributes Set by Listener<br>");
		out.println("<br/>");
		
		Dog dog = (Dog) getServletContext().getAttribute("dog");
		
		out.println("Dog's breed is : "+dog.getBreed());
	}
}
