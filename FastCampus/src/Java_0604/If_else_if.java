package Java_0604;

import java.util.Scanner;

public class If_else_if {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("학생의 성적을 입력하세요 = ");
        int score = scan.nextInt();

        if(score >=80 ){
            if(score>=90) {
                System.out.println("A반 입니다.");
            }else if(score >=85) {
                System.out.println("B반 입니다.");
            }else System.out.println("C반 입니다.");
        }
        else System.out.println("미안, 불합격이다.");
    }
}
