package Poly;

public abstract class Animal {
    public abstract void bark(); //-> 추상 메서드 (불완전한 메서드) : 메서드의 구현부가 없다는 특징 (void 앞에 abstract라고 입력해줘야 한다.)
    public abstract void eat();

    //body가 있는 구현된 일반 메서드
    public void move() {
        System.out.println("무리를 지어서 이동한다.");
    }

}



