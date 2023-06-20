package FastCampus.Java_0607_09;
import FastCampus.model.StudentVO;
public class StudentArrayTest {
    public static void main(String[] args) {
        //Q.객체 배열을 이용하여 4명의 학생(Student) 데이터를 저장하고 출력하세요.
        StudentVO[] std = new StudentVO[4];

        std[0] = new StudentVO("홍길동","컴퓨터 공학과",31,"byte@empas.com",20120912,"010-1111-1111");
        std[1] = new StudentVO("나길동","무역학과",35,"bit@capmes.com",20230501,"010-2222-2222");
        std[2] = new StudentVO("고길동","국어국문학과",25,"mandk@naver.com",20210506,"010-3333-3333");
        std[3] = new StudentVO("가길동","경영학과",34,"bited@naver.com",20220907,"010-4444-4444");

        for(int i=0; i < std.length; i++) {
            System.out.println(std[i]);
        }

        System.out.println();
        for ( StudentVO st : std) {
            System.out.println(st);
        }
        System.out.println();
        int[] startArray = {1, 2, 3, 4, 5};
        int[] copyArray = new int[3];

        System.arraycopy(startArray, 1, copyArray, 0, 3);

        // 복사된 요소 출력
        for (int i = 0; i < copyArray.length; i++) {
            System.out.print(copyArray[i]);
        }
    }
}
