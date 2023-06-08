package model;

public class PersonVo {
    private String name;
    private int age;
    private String phone;

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
}
//만들어진 클래스를 사용하려면 객체를 생성하여 사용 -> 객체지향