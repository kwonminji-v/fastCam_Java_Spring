package Java_0604;

import java.util.Scanner;
public class If_block {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("알고 싶은 숫자를 입력하세요 = ");

        int knownum = scan.nextInt();

        if(knownum%2 == 0) {
            System.out.println("입력하신" + knownum + "의 값은 짝수입니다.");
        }else
            System.out.println("입력하신" + knownum + "의 값은 홀수입니다.");


        System.out.print("숫자를 입력하세요 = ");
        int twelvenum = scan.nextInt();

        if(twelvenum%12 == 0) {
            System.out.println("12의 배수!");
        } else {
            System.out.println("not 12의 배수");
        }

        System.out.println("조건식 종료");
    }

}
