package Java_0607_09;


import model.PersonVo;

public class Capsul_personvo {
    public static void main(String[] args) {

        //Q. 한사람의 [회원] 정보를 저장할 [객체를 생성]하세요.
        PersonVo vo = new PersonVo();
        PersonVo vo1 = new PersonVo("나길동" , 50, "222-2222-2222");
        PersonVo vo2 = new PersonVo("나길동" , 50, "222-2222-2222");

        System.out.println(vo.getName() + "\t" + vo.getPhone() + "\t" + vo.getAge());
        System.out.println(vo1.getName() + "\t" + vo1.getPhone() + "\t" + vo1.getAge());
        System.out.println(vo2.getName() + "\t" + vo2.getPhone() + "\t" + vo2.getAge());
    }
}
