package FastCampus.model;

public class PersonVo {
    private String name;
    private int age;
    private String phone;

    //생략된 생성자 메서드가 있다. -> 기본생성자 (default Constructor)
    public PersonVo() {
        this.name = "홍길동";
        this.age = 30;
        this.phone = "111-1111-1111";
    }

    public PersonVo(String name, int age, String phone) {
        //객체를 생성하는 코드는 내부에서 만들어진다.
        //객체를 초기화 한다.
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    //setter method
    public void setName (String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }

    public String toString() {
        return name + "\t"+age+"\t"+phone;
    }
}
//만들어진 클래스를 사용하려면 객체를 생성하여 사용 -> 객체지향