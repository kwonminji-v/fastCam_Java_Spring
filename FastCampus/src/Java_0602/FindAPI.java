package Java_0602;

public class FindAPI {
    public static void main(String[] args) {
        int a;  //단순한 변수 선언
        //변수 앞에는 자료형이 오는데 자료형은 크게 기본 자료형 , 사용자 정의 자료형으로 나뉜다.
        /*mybook b; -> 이와 같이 사용자가 임의로 선언한 변수의 경우 java가 가지고 있는 API에서
                       불러올 수 없는 자료형이기 때문에 바로 에러가 발생한다. */
        a = 10;
        System.out.println(a);
        //"APPLE" 라는 문자열을 저장하고 출력해보자
        String s = "APPLE";
        System.out.println("s = " + s);
        System.out.println(s.length());
        //String에는 길이를 구하는 동작 , 대-소문자 구분하는 것, 동작을 구분하는 기능을 함


        /*
        java는 자료형을 사용하게 되면 컴파일러가 기본적으로 가지고 있는 자료형이 아닐 때,
        java에서 제공해주는 API를 찾아가게 되는데, API는 클래스들의 집합체이다.

        컴파일러가 알고 있는 API 위치로 이동하게 되는데, External Library폴더 내에 가지고 있다.
        컴파일러가 API를 하나하나 찾게 되면 너무 오래걸리기 때문에, String을 입력하면 String 앞에는
        java.lang.String이 생략되어 String으로 적히게 되는것이다.

        여기서 java.lang은 package이며, 쉽게 설명하면 폴더라고 생각하면 된다.
        경로로 치면 java -> lang -> String으로 이동하여 String 자료형을 불러와 주는 것.

        */
    }
}
