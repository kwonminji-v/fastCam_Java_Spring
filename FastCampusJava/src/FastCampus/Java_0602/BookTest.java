package FastCampus.Java_0602;

public class BookTest {
    public static void main(String[] args) {
        //Q. 한 권의 책 데이터를 저장하고 출력해보자 (6개의 변수로)
        String title = "JAVA";
        int price = 30000;
        String company = "민음사";
        String author = "권민지";
        int page = 700;
        String isbn = "11100995";

        System.out.println(title + "\t" + price + "\t" + company + "\t" + author + "\t" + page + "\t" + isbn);



        //Q. [책] 한 권을 저장할 [변수를 선언]하시오.
        Book b = new Book();
        title = b.title;
        System.out.println("title = " + title);

    }
    /*
    새로운 메서드 printBook을 만들어보자. 출력 또한, 아래의 메서드에서 출력될 수 있도록한다.
    메서드는 일종의 함수로 ( ) 안에 매개변수를 입력하여 받아서 출력할 수 있다.
    */

}
