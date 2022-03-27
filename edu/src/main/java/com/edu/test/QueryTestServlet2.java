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
		out.print("<html><head><title>Query 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>POST 방식 질의 문자열 추출</h1>");
		/*
		 * HTTP request body와 연결된 input stream 생성하여 반환
		 * body에 있는 데이터 , 즉 POST 방식의 질의문자열 전체를 한 번에 추출할 때 사용
		 * 
		 * 아래 세 라인은
		 * 1. req으로부터 inputStream을 가져와 ServletInputStream 생성
		 * 2. req의 요소길이, 즉 body의 길이를 len(:int)로 가져오기
		 * 3. len만큼의 byte 배열 생성
		 * 4. readLine(한 줄 읽어들여 저장할 바이트 배열, 저장소에 저장할 시작위치, 저장할 문자열의 길이)
		 * 5. 읽은 byte data를 String으로 변환하여 String객체 생성
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
		out.print("전체문자열 : " + s);
		out.println("</body></html>");
		out.close();
	}
}
