package com.edu.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class FirstServlet extends HttpServlet{
	@Override
	public void init(ServletConfig config) throws ServletException{
		System.out.println("init() activated");
	}
	
	@Override
	public void service(ServletRequest arg0,ServletResponse arg1) throws ServletException,IOException{
		System.out.println("service() activated");
	}
}
