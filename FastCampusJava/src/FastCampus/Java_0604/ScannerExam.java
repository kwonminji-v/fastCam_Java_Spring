package FastCampus.Java_0604;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        // 도서 정보를 입력받아보자
        Scanner scan = new Scanner(System.in);
        //System.in의 inputStream을 통해 사용자가 입력한 데이터를 읽어올 수 있다.
        System.out.println("제목 = ");
        String title = scan.nextLine();
        System.out.println("title = " + title);

        System.out.print("가격 = ");
        int price = scan.nextInt();
        System.out.println("price = " + price);

        scan.nextLine();

        System.out.println("출판사 = ");
        String company = scan.nextLine();
        System.out.println("company = " + company);

        System.out.println("저자 = ");
        String author = scan.nextLine();
        System.out.println("author = " + author);

        scan.close();
    }
}
