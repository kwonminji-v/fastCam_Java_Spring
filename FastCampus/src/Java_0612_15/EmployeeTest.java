package Java_0612_15;

public class EmployeeTest {
    public static void main(String[] args) {



        // 일반 사원 한명의 객체를 생성하고 데이터를 저장 후 출력을 하세요.
        RempVO vo = new RempVO("고길동",31,"111-1111-1111","2012-03-23","IT부서",false);
        // vo의 타입은 RempVO가 되며, 상속을 통해 Employee를 포함한 전체 메모리에 접근이 가능해집니다.



//        System.out.println(vo.name+"\t" + vo.age+"\t"+vo.phone+"\t"+vo.empDate+"\t"+vo.dept+"\t"+vo.marriage);

        System.out.println(vo.toString());






        //일반 회원 한사람의 정보가 초기화가 된 상태
        RempVO vo1 = new RempVO("고길동", 51,"222-2222-2222","2022-10-10","홍보부",true);
        //이 때, 부모의 상태정보가 정보은닉이 되어있지 않기때문에, 자식클래스가 부모의 상태정보에 다른 값들로 변경을 해도 제약 없이 변경이 가능한 상태이다.
        System.out.println(vo1.toString());
    }
}
