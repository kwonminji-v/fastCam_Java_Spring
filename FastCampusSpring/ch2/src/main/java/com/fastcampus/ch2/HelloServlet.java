package com.fastcampus.ch2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	
	//������ �ʱ�ȭ �� �� �ڵ� ȣ��Ǵ� �޼���
	//1. ������ �ʱ�ȭ �۾��� ���
	@Override
	public void init() throws ServletException {
		System.out.println("[HelloServlet] init() �޼��尡 ȣ��Ǿ����ϴ�.");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//2. service �޼���� 1. �Է� 2. ó�� 3. ����� ����
		System.out.println("[HelloServlet] service() �޼��尡 ȣ��Ǿ����ϴ�.");
		super.service(req, resp);
	}
	
	
	@Override
	public void destroy() {
		//3. ������ �޸𸮿��� ���ŵ� �� ���� �����̳ʿ� ���ؼ� �ڵ� ȣ��
	
		System.out.println("[HelloServlet] destroy() �޼��尡 ȣ��Ǿ����ϴ�.");    
	}
	
}
