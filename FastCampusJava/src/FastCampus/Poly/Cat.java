package FastCampus.Poly;

public class Cat extends Animal {

        public void night() {
            System.out.println("고양이는 밤에는 눈빛이 반짝인다.");
        }

        public void eat() {
            System.out.println("고양이가 먹는다");
        }
    @Override  //--> Override되었다는 어노테이션이 표시된다.
    public void bark() {
        System.out.println("냥냥");
    }


}
