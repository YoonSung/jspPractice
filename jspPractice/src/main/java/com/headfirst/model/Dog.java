package com.headfirst.model;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Dog implements HttpSessionBindingListener{
	
	private String breed; 
	
	public Dog(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}

	public void valueBound(HttpSessionBindingEvent event) {
		//Excute When Session is Added this Class Data
	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		//Excute When Session is Deleted this Class Data
	}
}
