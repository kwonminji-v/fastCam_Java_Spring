package Java_0606;

public class Ex_7_CallByVal {
    public static void main(String[] args) {
        //Q. [매개변수로 2개의 실수를 받아서] 총합을 구하여 / 출력하는 / 메서드를 정의하시오.
        float a = 56.7f;
        float b = 78.9f;

        floatAdd(a,b);
        // Call By Value -> 다른 메서드를 호출할 때 메서드(매개변수);를 작성하면 매개변수로 값이 전달되며
        // 해당 메서드로 제어권이 이동하게 된다.
    }
    public static void floatAdd(float a, float b) {
        float sum = a + b;
        System.out.println("sum = " + sum);
        //return 값이 없기 때문에 void 사용이 가능하다ㅏ.
    } /*메서드가 전부 실행되고 나면 메서드로 이동되었던 제어권이 다시 main 메서드로 이동하게 된다.
        메인으로부터 프로그램이 시작되고 끝이나는 것 (메서드를 호출하면 중간에 메서드를 호출하고
        다시 메인으로 이동하여 종료가 되는것)*/
}
