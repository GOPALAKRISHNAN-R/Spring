package com.gk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Simple Java program for Spring
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class MainApp
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		HelloWorld hello = ctx.getBean(HelloWorld.class);
		
		hello.setMessage("Hello World!");
		
		hello.getMessage();
		
		HelloWorld h=ctx.getBean(HelloWorld.class);
		
		h.setMessage("hi");
		
		h.getMessage();
		

	}

}
