package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/netInfo")
public class NetInfoServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		resp.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = resp.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Test</title> ");
		out.print("</head> ");
		out.print("<body> ");
		out.print("<h1>��Ʈ��ũ ���� ��û ����</h1> ");
		
		out.print("Request Scheme : "+req.getScheme()+"<br/>");
		out.print("Server Name : "+req.getServerName()+"<br/>");
		out.print("Server Address: "+req.getLocalAddr()+"<br/>");
		out.print("Server Port : "+req.getServerPort()+"<br/>");
		out.print("Client Address : "+req.getRemoteAddr()+"<br/>");
		out.print("Client Host : "+req.getRemoteHost()+"<br/>");
		out.print("Client Port : "+req.getRemotePort()+"<br/>");
		
		out.print("</body>");
		out.print("</html> ");
		
		out.close();
	}
}
