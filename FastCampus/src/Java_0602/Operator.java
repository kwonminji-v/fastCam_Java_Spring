package Java_0602;

public class Operator {
    public static void main(String[] args) {
        //Q. 두 과목의 점수를 이용하여 총점과 평균을 출력하는 프로그램 만들기
        int kor = 77;
        int eng = 87;
        int totalsum = kor + eng;
        int average = (kor + eng) / 2;

        System.out.println("두 과목을 모두 합한 값은 = " + totalsum);
        System.out.println("두 과목의 평균은 = " + average);
    }
}
