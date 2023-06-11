package Java_0607_09;

import model.Myutil;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = Myutil.hap(a,b); //클래스이름.호출메서드  -> 이렇게 작성하면 static영역에 접근이 가능해진다.
        //static으로 메서드를 호출하게되면 메서드 이름이 이탤릭체로 작성되게 된다!
        System.out.println("sum = " + sum);
    }
}
