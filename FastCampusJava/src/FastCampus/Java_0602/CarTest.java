package FastCampus.Java_0602;

public class CarTest {
    public static void main(String[] args) {
        //Q. 자동차의 정보를 저장하는 변수를 만들어보자
        String model = "BMW528i";  // -> 문자열 데이터가 필요
        System.out.println("FastCampus.model = " + model);
        long distance = 100000;
        System.out.println("distance = " + distance);
        /* long으로 선언 시, 숫자 끝에 l를 기입하여 크기를 지정해준다. 그냥 숫자를 기입하면 int형으로 인식하는데,
        long은 8byte int 4byte이기 때문에 데이터의 크기를 잘 보고 l을 붙여주어야한다. */
        int price = 9000000;
        String company = "BMW";
        char type = 'A';
        boolean auto = true;
        int year = 2000;
        float gasmi  = 12.5f;
        /* float로 선언 시 , 실수를 담고자 하는데 기본으로 float를 인식하며 실수는 정밀도를 위해 선언하니
        소수점 아래 숫자가 00000...으로 많이 쪼개져야하는데, 그냥 12.5는 double로 인식되기 때문에 4 byte인 float엔 담길 수 없어
        값 마지막에 f를 붙여주어서 float 형임을 명시해주어야한다.*/
    }
}




