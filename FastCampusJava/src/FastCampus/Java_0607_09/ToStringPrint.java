package FastCampus.Java_0607_09;

import FastCampus.model.PersonVo;

public class ToStringPrint {
    public static void main(String[] args) {
        //Q.생성자 메서드를 통해서 PersonVo객체에 원하는 이름, 나이, 전화번호를 저장하고 toString() 메서드로 출력하세요.
        PersonVo vo = new PersonVo("홍길동" , 34, "111-1111-1111");
        System.out.println(vo.getName() + "\t" + vo.getAge()+"\t"+vo.getPhone());
        System.out.println(vo.toString());
        //getter를 세번이나 입력해서 출력을 반복하는 것보다 toString
    }
}
