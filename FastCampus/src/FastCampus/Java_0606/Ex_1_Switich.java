package FastCampus.Java_0606;

import java.util.Scanner;

public class Ex_1_Switich {
    public static void main(String[] args) {

        System.out.println("요일을 입력하세요 = ");

        Scanner scan = new Scanner(System.in);
        String day = scan.next();


        switch(day) {
            case "월요일":
                System.out.println("농구하기");
                break;

            case "화요일" :
            case "수요일" :
                System.out.println("수영하기");
                break;

            case "금요일":
                case "토요일":
                System.out.println("휴식");
                break;
            case "일요일":
                System.out.println("야구하기");
                break;
            default:
                System.out.println("요일을 잘못 입력하셨습니다.");
        }
    }
}
