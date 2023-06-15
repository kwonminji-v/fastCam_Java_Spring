package FastCampus.Java_0602;

public class BookExam {
    public static void main(String[] args) {
        //Q. [정수] 1개를 저장할 [변수를 선언]하시오.
        int a;

        Book b = new Book();
        b.title = "자바의 정석";
        b.price = 30000;
        b.company = "SM";
        b.author = "권민지";
        b.page = 700;
        b.isbn = "110513";

        System.out.println("b.title = " + b.title);
    }
    
}
