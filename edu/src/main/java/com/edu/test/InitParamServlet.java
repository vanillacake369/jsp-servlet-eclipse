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
	// ServletConfig : web.xml에 설정한 서블릿 정보 추출
	// 최초 요청 시 ServletConfig 단 한 번 생성
		id = config.getInitParameter("id");				
		password = config.getInitParameter("password");
		// config:getInitParameter에 name을 통해 
		// web.xml에 선언했던 init-param 에 선언했던 name(id):value(guest) 의 value 가져오기
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h2>서블릿 초기 추출변수</h2>");
		out.print("<h3>ID : "+id+"</h3>");
		out.print("<h3>password : "+password+"</h3>");
		out.close();		
	}
}
