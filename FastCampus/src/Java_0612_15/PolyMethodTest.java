package Java_0612_15;

import model.Animal;
import model.Cat;
import model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }

    private static void display(Animal all) {  //Animal ani => 다형성 인수
        all.eat();

    }
}
