package FastCampus.Java_0607_09;

public class StaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //아래에 만들어 둔 sum이라는 메서드를 호출해서 사용하자.
        int plus = StaticTest.sum(a,b); //일반적으로 static 메서드는 클래스 이름을 이용해서 호출한다.
        System.out.println("두 수의 합은 =  " + plus);
    }
    //Q. 매개변수로 2개의 정수를 입력받아서 총합을 구하여 리턴하는 메서드를 정의하시오.

    public static int sum(int x, int y) {
        int hap = x+y;
        return hap;
    }
}
