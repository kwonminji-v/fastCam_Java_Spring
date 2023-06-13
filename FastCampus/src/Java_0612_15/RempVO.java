package Java_0612_15;
//일반 사원도 데이터를 저장하려면 VO 구조가 필요합니다.
//앞서 Employee 클래스에서 만들어 둔 멤버변수를 상속받아 사용하면 됩니다.
public class RempVO extends Employee { //자식 클래스가 부모 클래스의 기억공간을 사용할 수 있도록 허락
        public RempVO() {
            super();
        }

        public  RempVO(String name, int age, String phone,String empDate,String dept, boolean marriage){
            //초기화를 진행(자식이 부모의 기억공간에 초기화를 하는 경우)
           super(name,age,phone,empDate,dept,marriage);
           //부모 클래스를 가리키는 포인터인 super()를 사용하여 ()안에 부모 클래스안의 상태변수를 작성하여 초기화하 생성자를 호출
            
        }


}
