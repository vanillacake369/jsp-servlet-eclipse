package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest2")
public class QueryTestServlet2 extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query ���ڿ� �׽�Ʈ</title></head>");
		out.print("<body>");
		out.print("<h1>POST ��� ���� ���ڿ� ����</h1>");
		/*
		 * HTTP request body�� ����� input stream �����Ͽ� ��ȯ
		 * body�� �ִ� ������ , �� POST ����� ���ǹ��ڿ� ��ü�� �� ���� ������ �� ���
		 * 
		 * �Ʒ� �� ������
		 * 1. req���κ��� inputStream�� ������ ServletInputStream ����
		 * 2. req�� ��ұ���, �� body�� ���̸� len(:int)�� ��������
		 * 3. len��ŭ�� byte �迭 ����
		 * 4. readLine(�� �� �о�鿩 ������ ����Ʈ �迭, ����ҿ� ������ ������ġ, ������ ���ڿ��� ����)
		 * 5. ���� byte data�� String���� ��ȯ�Ͽ� String��ü ����
		 * 
		 * public int readLine(byte[] b,
                    int off,
                    int len)
             throws IOException
             
             b - an array of bytes into which data is read
			off - an integer specifying the character at which this method begins reading
			len - an integer specifying the maximum number of bytes to read
		 */
		ServletInputStream input = req.getInputStream();	//1
		int len = req.getContentLength();					//2
		byte[] buf = new byte[len];							//3
		input.readLine(buf, 0, len);						//4
		String s = new String(buf);							//5
		out.print("��ü���ڿ� : " + s);
		out.println("</body></html>");
		out.close();
	}
}
