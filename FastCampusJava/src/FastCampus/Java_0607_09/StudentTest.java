package FastCampus.Java_0607_09;

import FastCampus.model.StudentVO;

public class StudentTest {
    public static void main(String[] args) {
        //Q. 정수 6개를 저장할 배열을 생성하세요
        int[] num = new int[6];
        num[0]=10;
        num[1]=30;
        num[2]=67;
        num[3]=98;
        num[4]=55;
        num[5]=32;

        for(int i=0; i < num.length; i++){
            System.out.println("\t"+num[i]);
        }

        //Q. 잘 설계된 학생(Student) 객체를 설계하고 데이터를 저장한 후 출력하세요.

        StudentVO std = new StudentVO("권민지", "컴퓨터학과",31,"minji@dkfjek.com",2012,"111-1111-1111");
        System.out.println(std);
    }
}
