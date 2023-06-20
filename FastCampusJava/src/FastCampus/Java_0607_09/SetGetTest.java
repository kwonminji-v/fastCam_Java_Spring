package FastCampus.Java_0607_09;

import FastCampus.model.PersonVo;

public class SetGetTest {
    public static void main(String[] args) {
        //Q. setter, getter 메서드를 통해 Person VO 객체에 이름, 나이 , 전화번호를 저장하고 출력하세요.

        PersonVo vo = new PersonVo();
        vo.setName("홍길동");
        vo.setAge(20);
        vo.setPhone("010-1234-5678");

        System.out.println(vo.getName() + vo.getAge()+vo.getPhone());
    }
}
//private로 접근이 제한된 변수들을 get,set을 사용하여 public으로 외부 클래스에서도 접근이 가능할 수 있게 설정해두었다.
//set속성으로 해당 메모리공간을 불러온 후 ( )안에 출력되기를 원하는 데이터를 입력한 후, get속성으로 출력할 수 있다.
