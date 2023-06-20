package FastCampus.Java_0612_15;


import FastCampus.model.Animal;
import FastCampus.model.Cat;
import FastCampus.model.Dog;
public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        //Dog, Cat을 저장할 배열을 생성해보자
        //Animal[] all = {new Dog(), new Cat()};
        //2. [다형성 배열을 만들어 보았다.]
        Animal[] all = new Animal[2];
        all[0] = d;
        all[1] = c;
        display(all);
    }

    public static void display(Animal[] all) {
        for (int i = 0; i < all.length; i++) {
            all[i].eat();
            if(all[i] instanceof Cat)
                ((Cat)all[i]).night();
        }
    }
}
