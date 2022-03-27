package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet{
	String id,password;
	@Override
	public void init(ServletConfig config) throws ServletException {
	// ServletConfig : web.xml�� ������ ���� ���� ����
	// ���� ��û �� ServletConfig �� �� �� ����
		id = config.getInitParameter("id");				
		password = config.getInitParameter("password");
		// config:getInitParameter�� name�� ���� 
		// web.xml�� �����ߴ� init-param �� �����ߴ� name(id):value(guest) �� value ��������
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h2>���� �ʱ� ���⺯��</h2>");
		out.print("<h3>ID : "+id+"</h3>");
		out.print("<h3>password : "+password+"</h3>");
		out.close();		
	}
}
