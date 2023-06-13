package Java_0612_15;

import model.Animal;
import model.Dog;

public class OverrideTest {
    public static void main(String[] args) {
        //Upcastiong(업캐스팅) -> 만약 다른 사람이 Dog클래스를 java 소스코드를 주지 않고, class 파일만 주었을 때, Dog 클래스로 선언하기 어려움
        //Animal <---> Dog.class(o) Animal 클래스가 Dog클래스와 상속관계에 있다는 것을 알고있다는 가정하에 Override 통해 eat()을 재 정의 할 수 있게 됩니다.
        Animal ani = new Dog();
        ani.eat();
        // Animal ----실행시점에서 메서드가 결정되는 것(동적바인딩)---> Dog
        // 작성 시에는 eat()가 Animal에 속해있는 것이라고 생각되어 에러가 나지 않았지만, 실행과 동시에 Dog의 eat()이 실행되게 됩니다 / 이를 동적바인딩이라고 합니다.
        System.out.println("ani = " + ani);
    }
}
