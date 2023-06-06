package Java_0606;

import java.util.Scanner;

public class Ex_3_While {
    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        int answer = (int)(Math.random() * 100) + 1;
        System.out.println(answer);

        int i = 1;
        do {
            System.out.println("1과 100사이의 정수를 입력하세요 = ");
            num = scan.nextInt();

            if(num > answer) {
                System.out.println("더 작은 수를 입력해보세요");
            } else if (num < answer) {
                System.out.println("더 큰 수를 입력해보세요");
            }
        }while(num!=answer);

        System.out.println("입력하신 값이 저장된 값과 일치합니다.");
    }
}
