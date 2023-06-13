package Java_0612_15;

import model.Animal;
import model.Cat;
import model.Dog;

public class PolyTest {
    public static void main(String[] args) {
        //다형성을 적용하기 위해서는 Upcasting으로 객체를 생성
        //상속 관계로 되어 있어야 하며, 재 정의가 되어있고, 메모리에서 동적 바인딩이 되어있는 관계여야 가능하다.
        //상위클래스가 동일한 메세지로 하위 클래스를 서로 다르게 동작시키는 객체지향 원리 (=message polymorphism)
        Animal ani = new Dog();
        ani.eat();
        //컴파일 시점에선 eat()가 Animal내의 eat() / 실행시점에서 호출될 메서드가 결정되는 바인딩 = 동적바인딩 -> 동적바인딩이 일어나야 eat()라는 메서드가 Animal것인지 Dog것인지 알 수 있다.

        ani = new Cat();
        ani.eat();
        ((Cat)ani).night();
    }
}
