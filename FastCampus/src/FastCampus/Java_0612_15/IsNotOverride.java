package FastCampus.Java_0612_15;

import FastCampus.Poly.Animal;
import FastCampus.Poly.Cat;
import FastCampus.Poly.Dog;

public class IsNotOverride {
    public static void main(String[] args) {
        //재정의를 하지 않아서 부모클래스가 명령을 내리면(메세지를 보내면 eat();를 입력하면) 오동작을 한다.-> 다형성을 보장하지 않는다.
        //그럼 다형성을 보장하기 위해서는 ? 재 정의를 강제로 하도록 만들어주어야 한다.)
        //재 정의를 강제로 하도록 하기 위해서 추상 클래스와 인터페이스라는 개념이 등장하게 됩니다.
        Animal all = new Dog();
        all.bark();

        all = new Cat();
        all.bark();

    }
}
