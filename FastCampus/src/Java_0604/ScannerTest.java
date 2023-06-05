package Java_0604;

import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt();  //블럭상태 -> 키보드로 부터 데이터를 입력 받아야 다음으로 진행될 수 있기 때문에 잠깐 멈춰있는 상태
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요 : ");
        float f = scan.nextFloat();
        System.out.println("f = " + f);

        System.out.print("문자열을 입력하세요 : ");
        String s = scan.next(); // 공백이 들어가게 되면 공백 전까지만 출력된다
        System.out.println("s = " + s);

        scan.nextLine();  // 버퍼 비우기(스트림 비우기)
        System.out.print("문자열을 입력하세요 : ");
        String s1 = scan.nextLine(); // 공백이 들어가게 되면 공백 전까지만 출력된다
        System.out.println("s1 = " + s1);

    }
}
