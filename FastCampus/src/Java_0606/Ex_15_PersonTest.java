package Java_0606;

public class Ex_15_PersonTest {
    public static void main(String[] args) {
        //Q. [한 사람의] 데이터를 저장할 [변수를 선언]하세요
        //[인스턴스 만드는 과정]
        //모델링 된 Person 클래스를 이용하여 객체를 메모리에 생성하세요
        //객체 p가 생성된 후 , new 연산자와 생성자 메서드()로 실체를 생성하였고, 생성된 객체를 변수에 할당하였습니다.

        Ex_14_PersonDTO p = new Ex_14_PersonDTO();
        p.name = "홍길동";
        p.age = 30;
        p.phone = "010-1234-5678";

        //객체를 생성 후 dot연산자를 이용해서 데이터에 접근 후 출력해보았다.
        System.out.println(p.name + "\t" + p.age + "\t" + p.phone);

        p.play();
        p.eat();
        p.walk();

    }
}
