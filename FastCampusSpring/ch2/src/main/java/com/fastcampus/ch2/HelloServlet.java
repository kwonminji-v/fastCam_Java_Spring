package com.fastcampus.ch2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	
	//서블릿이 초기화 될 때 자동 호출되는 메서드
	//1. 서블릿의 초기화 작업을 담당
	@Override
	public void init() throws ServletException {
		System.out.println("[HelloServlet] init() 메서드가 호출되었습니다.");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//2. service 메서드로 1. 입력 2. 처리 3. 출력을 실행
		System.out.println("[HelloServlet] service() 메서드가 호출되었습니다.");
		super.service(req, resp);
	}
	
	
	@Override
	public void destroy() {
		//3. 서블릿이 메모리에서 제거될 때 서블릿 컨테이너에 의해서 자동 호출
	
		System.out.println("[HelloServlet] destroy() 메서드가 호출되었습니다.");    
	}
	
}
