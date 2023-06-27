package FastCampus.Java_0606;

public class Ex_8_CallByRef {
    public static void main(String[] args) {
        //Q. 배열의 총합을 구하여 출력
        int[] a = {1,2,3,4,5};
        int result = addArray(a); //a에는 번지를 전달(Call By Reference
        System.out.println("result = " + result);
        

    }

    //Q. 매개변수로 정수형 배열을 받아서 / 배열의 총합을 구하여 / 리턴하는 / 메서드를 정의하세요
    public static int addArray(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        return sum;
    }
}
