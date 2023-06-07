package Java_0607_09;

//object = 상태정보 (멤버변수) + 행위정보(멤버메서드)
public class PersonDTO {
    public String name;
    public int age;
    public String phone;

    // ↓ 기본 생성자 메서드(default 생성자)
    public PersonDTO() {

    }

    public void play() {
        System.out.println("운동을 한다.");
    }
    public void eat() {
        System.out.println("음식을 먹다.");
    }
    public void walk() {
        System.out.println("걷다.");
    }
}
