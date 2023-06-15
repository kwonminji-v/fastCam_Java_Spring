package FastCampus.Poly;

public class Dog extends Animal {

    public void eat() {
        System.out.println("강아지가 먹는다.");
    }
    @Override
    public void bark() {
        System.out.println("멍멍");

    }
    //Animal에도 eat() { ? } 라는 기능으로 작성되어 있음 (다형성이 보장되어 있지 않았음)
    //재정의 하지 않은 상황

}
