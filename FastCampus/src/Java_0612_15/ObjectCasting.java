package Java_0612_15;

import model.Animal;
import model.Cat;
import model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        //Animal --> Dog, Cat
        Animal ani = new Dog();
        ani.eat();
    //부모 클래스(Animal)이 자식 클래스(Dog,Cat)에게 동일한 메세지(eat())를 보냅니다. => 호출한다.
        ani = new Cat();
        ani.eat();
        // 여기서 Cat 클래스 안에 있는 night() 메서드를 호출하면 night 메서드는 부모 클래스인 Animal에는 재 정의가 되어있지 않아 에러가 발생합니다. 이 때, 다시 Animal(부모)을 Cat(자식)타입으로 다시 형변환을 진행해주어야 합니다. 이걸 Downcasting 이라고 합니다.
        ani.night(); // 다운캐스팅이 필요


    }
}
