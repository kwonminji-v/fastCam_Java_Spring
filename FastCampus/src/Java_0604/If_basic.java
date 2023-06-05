package Java_0604;

import java.util.Scanner;

public class If_basic {
    public static void main(String[] args) {
        //Q. x의 값이 0보다 큰 경우에만 "양수입니다" 출력
        int x = -1;
        if (x > 0) {
            System.out.println("양수입니다.");
        } else System.out.println("음수입니다.");

        //Q. 정수 1개를 입력 받아 입력된 수가 7의 배수인지 출력하세요
        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num = scan.nextInt();

        if(num%7 == 0) {
            System.out.println(num + "은 7의 배수입니다.");
        } else System.out.println(num + "은 7의 배수가 아닙니다.");


        System.out.println("종료되었다.");
    }
}
