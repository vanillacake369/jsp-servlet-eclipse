package com.edu.test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hello2")
public class FirstServlet extends HttpServlet{
	@Override
	public void init(ServletConfig config)throws ServletException{
		System.out.println("init() ½ÇÇàµÊ");
	}
	public void service(ServletRequest arg0,ServletResponse arg1) throws 
												ServletException,IOException{
		System.out.println("service() ½ÇÇàµÊ!");
		
	}
}
