package Java_0604;

import java.util.Scanner;

public class Quiz_1 {
    public static void main(String[] args) {
        //Q.4의 배수이면서 100의 배수가 아닌 해이거나 400의 배수인 해 -> 2월 29일이 존재하는 연도
        System.out.print("윤년인지 알고 싶은 해를 입력하세요 = ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if((year%4 == 0 && year%100 != 0)|| (year%400 == 0)) {
            System.out.println("입력하신" + year + "년은 윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }
    }
}
