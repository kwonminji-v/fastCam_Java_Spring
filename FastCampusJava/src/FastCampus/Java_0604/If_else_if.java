package FastCampus.Java_0604;

import java.util.Scanner;

public class If_else_if {
    public static void main(String[] args) {

        System.out.print("학생의 성적을 입력하세요 = ");

        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 80) {
                if (score >= 90) {
                    System.out.println("A반 입니다.");
                } else if (score >= 85) {
                    System.out.println("B반 입니다.");
                } else System.out.println("C반 입니다.");
            } else System.out.println("미안, 불합격이다.");

        } else {
            System.out.println("유효한 점수가 아니다.");
        }
    }
}
