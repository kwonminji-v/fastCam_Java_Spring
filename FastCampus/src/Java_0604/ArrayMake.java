package Java_0604;

public class ArrayMake {
    public static void main(String[] args) {
        //Q.정수 5개를 저장 할 [배열]을 생성하시오.
        int[] a = {10,20,30,40,50};
        /*
        5개의 연속적 메모리공간을 만든 후 정수 5개가 들어가야하기때문에 타입은 전부 int이다.
        구조의 이름읜 int[]이고, 1차원 배열이되고 배열도 하나의 Object라고 여겨진다.
        */

        for(int i=0; i < a.length; i++) {
            a[i] += 10+i;
            System.out.println(a[i]);
        }
        // 배열은 반복문을 사용하여 데이터를 출력하면 효율적으로 출력이 가능하다.

        //Q. [실수 5개]를 저장 할 [배열을 생성]하고 모든 원소에 10을 저장하고 출력한다.
        float[] f = new float[5];
        f[0] = 10.5f;
        f[1] = 20.5f;
        f[2] = 43.5f;
        f[3] = 65.5f;
        f[4] = 95.5f;

        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }

        //Q. 정수 5개를 아래처럼 [배열에 초기화] 하고 index 0번째와 index 3번째 값을 더하여 출력해보자
        int[] b={10,11,12,13,14};

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        int sum = b[0] + b[3];
        System.out.println("sum = " + sum);
    }
}
