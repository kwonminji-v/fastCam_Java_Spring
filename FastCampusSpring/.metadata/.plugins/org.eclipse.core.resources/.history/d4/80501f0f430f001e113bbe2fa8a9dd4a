package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1.원격 호출 가능한 프로그램으로 등록하고자 @Controller를 작성
@Controller
public class Hello {
	
	int iv = 10;  //인스턴스 변수
	static int cv = 20;  //static 변수
	
	
	@RequestMapping("/hello")
	public void main() {  //인스턴스 메서드 - iv, cv 둘 다 사용이 가능
		//void 앞에 static이 없는데 호출이 가능한건 ip주소로 호출하면 인스턴스 메서드를 출력하는데,
		//객체를 생성 후 호출이 가능하다. 근데 여기선 객체 생성 없이 호출이 되고 있는데, tomcat이 객체 생성을 해주고
		//이 후 메서드를 호출해줌 
		//why? 인스턴스 메서드인가
		System.out.println("Hello-static");
		System.out.println(cv);
	}
	
	public static void main2() { // static 메서드로서 cv변수만 사용가능
		System.out.println(cv);
		//System.out.println(iv); //iv는 static이 아니라서 에러가 발생
	}
}
