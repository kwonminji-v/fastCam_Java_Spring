package FastCampus.Java_0612_15;

import FastCampus.model.Animal;
import FastCampus.model.Cat;
import FastCampus.model.Dog;

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
