package Java_0612_15;

import model.Animal;
import model.Cat;
import model.Dog;

public class AnimalUpcastingTest {
    public static void main(String[] args) {
        //Q. Dog와 Cat 클래스를 설계하고 동작 시켜 보세요
        //Dog d = new Dog();

        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
    }
}
