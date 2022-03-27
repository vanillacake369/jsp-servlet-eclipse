package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest")
public class QueryTestServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query ���ڿ� �׽�Ʈ</title></head>");
		out.print("<body>");
		out.print("<h1>Get������� ��û�Ǿ����ϴ�.</h1>");
		
		String id = req.getParameter("id");
		String password = req.getParameter("pwd");
		String name = req.getParameter("name");
		String[] hobbies = req.getParameterValues("hobby");
		String gender = req.getParameter("religion");
		String intro = req.getParameter("introduction");
		
		out.print("id : "+id+"<br/>");
		out.print("password : "+password+"<br/>");
		out.print("name : "+name+"<br/>");
		out.print("hobbies : ");
		for (int i = 0; i < hobbies.length; i++) {
			out.print(hobbies[i]);
		}
		out.print("<br/>");
		out.print("gender : "+gender+"<br/>");
		out.print("intro : "+intro+"<br/>");
		
		
		out.println("</body></html>");
		out.close();
	}
	/*
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>���� ���ڿ� �׽�Ʈ</title></head>");
		out.print("<body>");
		out.print("<h1>Post������� ��û�Ǿ����ϴ�.</h1>");
		out.println("</body></html>");
		out.close();
	}
	*/
}
