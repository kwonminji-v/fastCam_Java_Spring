package FastCampus.Java_0612_15;

import FastCampus.Poly.Animal;
import FastCampus.Poly.Cat;
import FastCampus.Poly.Dog;
public class AbstractClassTest {
    public static void main(String[] args) {
        //추상클래스는 단독으로 객체를 생성할 수 없다.
        //Animal all = new Animal();  -> 추상클래스이며 부모클래스인 Animal은 스스로 객체를 생성할 수 없다.
        Animal all = new Dog();
        all.bark(); //멍멍
        all.move();
        all.eat();


        all = new Cat();
        all.bark();
        all.move();
        all.eat();
        ((Cat)all).night();

    }
}
