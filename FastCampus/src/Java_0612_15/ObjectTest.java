package Java_0612_15;

import Poly.A;

public class ObjectTest {
    public static void main(String[] args) {
        //A 객체를 업캐스팅으로 생성하세요
        A a = new A();
        a.display();

        Object obj = new A();
        //A클래스의 부모생성자인
        ((A)obj).display();

    }
}

