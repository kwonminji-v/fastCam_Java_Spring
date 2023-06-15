package FastCampus.Java_0607_09;

public class PersonAccessTest {
    public static void main(String[] args) {
        //Q.Person 클래스에 이름, 나이, 전화번호를 저장한 후 출력하세요.
        PersonDTO p = new PersonDTO();

        p.name = "홍길동";
        p.age = 31;
        p.phone = "010-1234-5678";
        System.out.println(p.name + p.age + p.phone);



    }
}
