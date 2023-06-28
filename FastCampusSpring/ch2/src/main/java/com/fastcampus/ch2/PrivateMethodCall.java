package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {

	public static void main(String[] args) throws Exception {
		//Hello hello = new Hello();
		//hello.main();
		//���� main�� private�� �ܺ� ȣ���� �Ұ���
		
		// Spring framework�� Reflection API�� ���� �����
		// Reflection API�� ��� - Ŭ���� ������ ��� �ٷ� �� �ִ� ������ �������
		// java.lang.reflect ��Ű���� ����
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		// Hello Ŭ������ Class ��ü (Ŭ������ ������ ��� �ִ� ��ü)�� ����
		// Ŭ���� ��ü�� class�� ���� ������ ���� ������ �ֱ� ������ ��ü ����, ��� �ҷ����� �� �� ����
		Hello hello = (Hello)helloClass.newInstance();  //Class ��ü�� ���� ������ ��ü ����
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true); // private�� main()�� ȣ�� �����ϰ� �Ѵ�.
		
		main.invoke(hello); //hello.main() �ѰͰ� �Ȱ���.
	}

}