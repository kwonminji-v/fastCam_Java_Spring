package Java_0606;

/*
생성된 메서드들의 이름은 같지만 메서드 내의 개수는 같고, 매개변수가 int와 float로 다르기때문에
add 2개를 중복하여 정의할 수 있다 -> 메서드의 오버로딩
메서드들의 이름이 같은 상황에서 만약 add의 중복정의가 많이 되어있다면, add 메서드는 어떤 메서드로 호출이 되어야 하는지는
아래로 전부 읽어내려가면서 찾기 때문에 실행 속도가 더딜 수 있다. 매개변수의 타입을 하나하나 비교해서 일치하는 메서드를
찾아야하기 때문이다.
 */
public class Ex_9_Overloading {
    public static void main(String[] args) {
        float v = add(35.6f, 56.7f);
        System.out.println("v = " + v);
        
        int x = add(15,5);
        System.out.println("x = " + x);
    }

    //Q.매개변수로 두개의 정수 값을 받아서 / 총합을 구하여 / 리턴 하는 / [메서드를 정의]하세요.
    public static int add(int a, int b) {  //main이 static 키워드를 가지고 있으니 호출될 메서드에도 static을 작성
        int sum = a+b;
        return sum;
    }

    //Q. 매개변수로 두개의 실수 값을 받아서 / 총합을 구하여 / 리턴하는 / [메서드를 정의] 하세요.
    public static float add(float a, float b) {
        float sum = a+b;
        return sum;
    }
}
