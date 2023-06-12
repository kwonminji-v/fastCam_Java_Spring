package Java_0612_15;

//사원이라는 클래스의 데이터를 갖고있는 VO입니다.
public class Employee {
    // extends Object가 생략되어 있습니다. java에서 API를 만들 때 가장 최상위에 생성되는 클래스를 Object 클래스라고 합니다. 모든 클래스를 설계하면 부모 클래스를 물려받도록 되어 있는데 기본적으로 Object 클래스를 상속받고 있습니다.
    private String name;
    private int age;
    private String phone;
    private String empDate;
    private String dept;
    private boolean marriage;

    public Employee() {
        super();  //  상위 클래스의 생성자를 호출하는 역할 (객체가 생성되려면 생성자가 호출되어야 생성이 가능 / 여기서는 new Object가 호출되는 것)
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
