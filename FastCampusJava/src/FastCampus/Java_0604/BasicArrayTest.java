package FastCampus.Java_0604;

public class BasicArrayTest {
    public static void main(String[] args) {
        //[실수 3개]를 저장할 [배열을 출력] -> 기본배열
        float[] f = {24.6f, 35.6f, 59.25f};

        //Q. [책] 3권을 저장 할 [배열을 생성]하고, 책 3권의 데이터를 저장하고 출력하세요.

        Book[] b = new Book[3]; // -> 객체 배열이다.
        // 책 한권의 객체를 생성했다. 같은 패턴으로 b[2], b[3]으로 새로운 객체를 생성할 수 있다.
        b[0] = new Book();
        b[0].title = "자바";
        b[0].price = 30000;
        b[0].company = "한빛미디어";
        b[0].author = "권민지";
        b[0].page = 500;
        b[0].isbn = "75618616";

        //System.out.println("b[0]= " + b[0].title + b[0].author);

        b[1] = new Book();
        b[1].title = "제목";
        b[1].price = 50000;
        b[1].company = "민음사";
        b[1].author = "가나다";
        b[1].isbn = "6511551";
        b[1].page = 15631;

        //System.out.println("b[0]= " + b[1].title + b[1].author);

        b[2] = new Book();
        b[2].title = "바보";
        b[2].price = 50000;
        b[2].company = "민음사";
        b[2].author = "가나다";
        b[2].isbn = "6511551";
        b[2].page = 15631;
        //System.out.println("b[0]= " + b[2].title + b[2].author);

        for (int i = 0; i < b.length; i++){
            System.out.println("b[0]= " + b[i].title + b[i].author);
        }
    }
}
