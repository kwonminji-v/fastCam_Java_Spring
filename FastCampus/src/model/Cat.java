package model;

public class Cat extends Animal {
        public void night() {
            System.out.println("밤에는 눈빛이 반짝인다.");
        }
        //Cat은 부모클래스에서 온 eat() 메서드도 상속받아 총 2개의 메서드를 사용할 수 있게 되었음
}
