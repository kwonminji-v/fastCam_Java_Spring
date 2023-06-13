package model;

public class Dog extends Animal{
    //부모클래스에 eat() 라는 메서드가 있고 extends를 통해 부모클래스에 있는 메서드를 사용할 수 있도록 허락해준 상황
    public Dog(){ //생성자가 { } 내에서 실행이 완료되어야 Dog() 객체가 완벽하게 만들어지는데,
                  // Animal(부모)부터 만들어진 후 수행문이 실행되어야 하는데 수행문을 먼저 작성되었기 때문에 super()에서 에러가 발생합니다.
        int a = 10;  // 수행문
        super();  // new Animal()이 super()에 의해서 호출됨

    }

}
