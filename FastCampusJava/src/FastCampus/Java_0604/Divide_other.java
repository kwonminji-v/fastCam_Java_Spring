package FastCampus.Java_0604;

public class Divide_other {
    public static void main(String[] args) {
        //Q.나머지 연산자를 이용하여 정수의 자릿수를 구해보자

        int bigdata = 6597;
        System.out.println(bigdata%10);
        System.out.println(bigdata/10%10);
        System.out.println(bigdata/100%10);
        System.out.println(bigdata/1000%10);
        
        int num = 2579;
        int a = num%10;
        int b = num/10%10;
        int c = num/100%10;
        int d = num/1000%10;
        int sum = a+b+c+d;
        System.out.println(a+"+"+b+"+"+c+"+"+d);
        System.out.println("sum = " + sum);

        if(num%2 ==0) {
            System.out.println("짝수입니다.");
        } else
            System.out.println("홀수입니다.");
    }
}
