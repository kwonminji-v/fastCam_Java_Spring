package Java_0607_09;

import model.Myutil1;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 16;
        //static이 아닌 클래스를 사용한다면 객체를 생성해주면 된다.
        Myutil1 ut = new Myutil1();
        int sum = ut.hap(a,b);
        System.out.println("sum = " + sum);
    }
}
