package StudyExam;

//Animal은 인터페이스! 그리고 이 인터페이스는 sound와 eat이라는 추상메서드를 선언
interface Animal {
    void sound();
    void eat();
}

class Lion implements Animal {
    //Lion클래스는 Animal클래스를 implements(구현)하고 있어 sound와 eat의 메서드를 재정의해서 구현해야함
    @Override
    public void sound() {
        System.out.println("크와앙");  //Lion 클래스에서 추상 메서드를 구현
    }
    @Override
    public void eat() {
        System.out.println("사냥을 해서 먹습니다.");
    }
}

public class InterFaceMethod {
    public static void main(String[] args) {
        Animal lion = new Lion();  // Lion 클래스를 Animal 인터페이스로 참조
        lion.sound();
        lion.eat();
    }
}
