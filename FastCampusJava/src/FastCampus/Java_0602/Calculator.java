package FastCampus.Java_0602;

/* 클래스 단위로 코딩을하며, 시작을 위해서는 main 메서드를 생성하여 사용한다. */
// main () {      } 메서드 / 인텔리제이 출력 단축기 sout( = syso)
public class Calculator {
    public static void main(String[] args) {
        // Q. 두 개의 정수를 사칙연산하여 출력하는 자바 프로그램을 만들어보자.
        int a, b, sum, sub, doub, divd;
        a = 12;
        b = 2;
        sum = a + b;
        sub = a - b;
        doub = a * b;
        divd = a / b;
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + sub);
        System.out.println("a * b = " + doub);
        System.out.println("a / b = " + divd);
    }
}

