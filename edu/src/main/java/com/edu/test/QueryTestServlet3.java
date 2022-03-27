package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/queryTest3")
public class QueryTestServlet3 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query ���ڿ� �׽�Ʈ</title></head>");
		out.print("<body>");
		out.print("<h1>GET ������� ��û�Ǿ����ϴ�</h1>");
		
		String name = req.getParameter("name");
		out.print("�̸� : "+name+"<br/>");
		
		out.println("</body></html>");
		out.close();
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>���� ���ڿ� �׽�Ʈ</title></head>");
		out.print("<body>");
		out.print("<h1>Post������� ��û�Ǿ����ϴ�.</h1>");
				
		String name = req.getParameter("name");

		out.print("name : "+name+"<br/>");

		out.println("</body></html>");
		out.close();
	}
}
