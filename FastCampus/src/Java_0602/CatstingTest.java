package Java_0602;

public class CatstingTest {
    
    public static void main(String[] args) {
        
        float f1 =.10f;  // 0.10
        System.out.println("f1 = " + f1);
        
        float f2 = 15f; // 15.0
        System.out.println("f2 = " + f2);
        
        float f3 = 3.14f;
        System.out.println("f3 = " + f3);

        double d1 = 123.4567;
        System.out.println("d1 = " + d1);

        float x = 15.6f;
        int y = (int)x;
        /*
        실수형 데이터가 정수형 데이터에 저장하려면 (int)로 강제형변환을 진행해야 함
        강제 형변환 시 값 손실이 발생한다.
        */
        System.out.println("y = " + y);

        char c = 'A';
        int cc = c;
        System.out.println("cc = " + cc);
        /*
        c는 2byte, cc는 4byte로 수치형 자료로 서로 호환이 가능하기 때문에,
        자동형변환이 가능하며, 값 손실이 발생하지 않는다.
        */

        int deci = 10110011;

    }
}
