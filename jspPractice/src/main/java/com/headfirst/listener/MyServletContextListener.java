package com.headfirst.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.headfirst.model.Dog;

public class MyServletContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
		ServletContext servletContext = event.getServletContext();
		String dogBreed = servletContext.getInitParameter("breed");
		
		servletContext.setAttribute("dog", new Dog(dogBreed));
	}

	public void contextDestroyed(ServletContextEvent event) {

	}

}
