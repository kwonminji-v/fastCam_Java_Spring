package Java_0606;

public class Ex_2_forloop {
    public static void main(String[] args) {
        //Q.반복문을 이용하여 알파벳 대문자와 아스키 코드 값을 출력해보자
//        for (int i = 1; i <=10; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 65; i < 91; i++) {
//            System.out.println(i + " : " + (char)i);
//        }
//        //Q. 배열에 있는 원소를 출력해보자
//        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
//
//        for (int i=0; i< numbers.length; i++) {
//            System.out.print(numbers[i] + "\t");
//        }
//
//        for(int num : numbers) {
//            System.out.println(num);
//        }
//
//        String[] name = {"권민지","기므니","김서히","김지수","배종히"};
//
//        for (String na : name) {
//            System.out.println(na);
//        }

        int sum = 0;

        for(int i=1; i<=10; i++){
            sum += i;
            System.out.println("sum = " + sum);
        }
    }
}
