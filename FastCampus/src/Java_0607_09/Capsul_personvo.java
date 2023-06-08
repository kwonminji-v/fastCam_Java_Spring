package Java_0607_09;

import model.PersonVo;

public class Capsul_personvo {
    public static void main(String[] args) {

        //Q. 한사람의 [회원] 정보를 저장할 [객체를 생성]하세요.

        PersonVo vo = new PersonVo();
        vo.setName("홍길동");
        vo.setAge(90);
        vo.setPhone("105301-+56465");

        System.out.println(vo.getName());
    }
}
