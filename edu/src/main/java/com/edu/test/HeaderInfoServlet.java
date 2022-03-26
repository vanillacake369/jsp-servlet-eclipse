package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/headerInfo")
public class HeaderInfoServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Test</title> ");
		out.print("</head> ");
		out.print("<body> ");
		
		out.print("<h1>요청 헤더 정보</h1> ");
		Enumeration<String> em = req.getHeaderNames();
		while(em.hasMoreElements()) {
			String s =em.nextElement();
			out.println(s+" : "+req.getHeader(s)+"<br/>");
		}
		
		out.print("</body></html>");
		out.close();
	}
}
