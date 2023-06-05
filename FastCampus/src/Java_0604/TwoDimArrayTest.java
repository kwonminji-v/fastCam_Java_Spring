package Java_0604;

public class TwoDimArrayTest {
    public static void main(String[] args) {
        //Q. 2행 4열의 정수형 [배열을 생성] 해보자
        int [][] a = new int[2][4];

        a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 30;
        a[0][3] = 40;

        a[1][0] = 11;
        a[1][1] = 21;
        a[1][2] = 31;
        a[1][3] = 41;

        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);  //안 쪽의 for문이 거짓이 될때까진 j의 값 변경의 반복이 계속된다.
            }
            System.out.println();
        }

        // i = 0,1  j = 0,1,2,3으로 반복되야 출력 가능하다.

    }
}
