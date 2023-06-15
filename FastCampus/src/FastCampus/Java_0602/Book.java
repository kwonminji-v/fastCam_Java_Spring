package FastCampus.Java_0602;

//해당 Book은 메인메서드를 작성하지 않아도 되고, Book은 책이라는 구조를 만들기 위한 class를 만드는 과정이다.
//책(Object) : 제목, 가격, 출판사, 저자, 페이지수, isbn .. 필요 없는 속성들은 제외함 -> 모델링과정
//클래스 설계도구를 이용하여 새로운 자료형을 만드는 것 !

public class Book {
       public String title;
       public int price;
       public String company;
       public String author;
       public int page;
       public String isbn;
}

//해당 선언된 항목들을 속성 , 멤버변수 , 프로퍼티, 상태변수 등이라고 한다.
