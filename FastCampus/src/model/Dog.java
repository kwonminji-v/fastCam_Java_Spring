package model;

public class Dog extends Animal{
        
    public void eat() {
        System.out.println("강아지처럼 먹어보자");
    }
    //부모 클래스가 가지고 있는 eat()를 재정의(Override)하는 것
}
