package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1.���� ȣ�� ������ ���α׷����� ����ϰ��� @Controller�� �ۼ�
@Controller
public class Hello {
	
	int iv = 10;  //�ν��Ͻ� ����
	static int cv = 20;  //static ����
	
	
	@RequestMapping("/hello")
	public void main() {  //�ν��Ͻ� �޼��� - iv, cv �� �� ����� ����
		//void �տ� static�� ���µ� ȣ���� �����Ѱ� ip�ּҷ� ȣ���ϸ� �ν��Ͻ� �޼��带 ����ϴµ�,
		//��ü�� ���� �� ȣ���� �����ϴ�. �ٵ� ���⼱ ��ü ���� ���� ȣ���� �ǰ� �ִµ�, tomcat�� ��ü ������ ���ְ�
		//�� �� �޼��带 ȣ������ 
		//why? �ν��Ͻ� �޼����ΰ�
		System.out.println("Hello-static");
		System.out.println(cv);
	}
	
	public static void main2() { // static �޼���μ� cv������ ��밡��
		System.out.println(cv);
		//System.out.println(iv); //iv�� static�� �ƴ϶� ������ �߻�
	}
}
