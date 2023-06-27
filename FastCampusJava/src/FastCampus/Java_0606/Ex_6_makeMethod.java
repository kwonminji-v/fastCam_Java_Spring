package FastCampus.Java_0606;

public class Ex_6_makeMethod {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        //add라는 메서드를 호출하여 두 수의 합의 결과를 받아보자
        int result = add(a,b);
        System.out.println("result = " + result);

    }
    //메서드는 독립적으로 만들어야 한다 / main 메서드 밖에서 작성한 후 main메서드에서 호출하여 사용하는 방식이다.
    //Q.[매개변수로 2개의 정수를 받아서] [총합을 구하여][리턴]하는 [메서드를 정의]해보자

    public static int add(int x, int y) {
        int sum = x+y;
        return sum;
    }
}
