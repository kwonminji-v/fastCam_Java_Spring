package Java_0606;

import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("1번_김");
            System.out.println("2번_김밥");
            System.out.println("3번_김가루");
            System.out.println("원하는 메뉴 눌러보세여 (0누르면 종료임) = ");

            String number = scan.nextLine();
            menu = Integer.parseInt(number);

            if(menu == 0) {
                System.out.println("프로그램 종료야");
                break;
            }else if( (menu <=1 && menu >=3) ){
                System.out.println("잘못 누름 다시 눌러야댐 종료는 0");
                continue;
            }
            System.out.println("선택한거 " + menu + "번이야");
        }
    }
}
