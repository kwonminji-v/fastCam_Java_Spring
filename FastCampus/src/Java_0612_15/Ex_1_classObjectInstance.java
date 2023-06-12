package Java_0612_15;


import model.StudentVO;

public class Ex_1_classObjectInstance {
    public static void main(String[] args) {
        StudentVO st1;   //st1 : object 객체를 그냥 저장할 변수에 불과합니다.

        st1 = new StudentVO();  //st1 : Instance 아직 값을 넣진 않았지만 st1이 구체적인 실체를 가리키고 있는 걸로 변함

        st1 = new StudentVO("홍길동","컴퓨터공학과",37,"mdkfa@naver.com",20120912, "111-1111-1111");
        //실제로 st1은 "홍길동"의 데이터가 들어가게되고 , 메모리도 new를 하게되면 객체가 만들어지며 객체가 생성되는 영역은 Heap Area영역이 되고 st1 -> 지역변수가 되며 main stack에서 만들어지게 됩니다.
        //st1,st2,st3로 생성된 인스턴스들은 각자 다 다른 번지를 가리키고 있기때문에 구별된다.
        System.out.println("st1 = " + st1);

    }
}
