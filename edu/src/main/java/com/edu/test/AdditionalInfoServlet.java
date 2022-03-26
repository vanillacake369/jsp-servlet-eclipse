package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/addInfo")
public class AdditionalInfoServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Test</title> ");
		out.print("</head> ");
		out.print("<body> ");
		
		out.print("<h1>추가 요청 정보</h1>");
		out.print("Request Method : "+req.getMethod() + "<br/>");
		out.print("Path Info : "+req.getPathInfo() + "<br/>");
		out.print("Path Translated : "+req.getPathTranslated() + "<br/>");
		out.print("Query String : "+req.getQueryString() + "<br/>");
		out.print("Content Length : "+req.getContentLength() + "<br/>");
		out.print("Content Type : "+req.getContentType() + "<br/>");
		
		out.print("</body></html>");
		out.close();
	}
}