package FastCampus.Java_0612_15;

import FastCampus.model.Animal;
import FastCampus.model.Cat;
import FastCampus.model.Dog;

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
