package Java_0606;

public class Ex_4_looploop {
    public static void main(String[] args) {
//        int index = 1;
//
//        for(int i = 0; i<5; i++) {
//            for(int j=0; j<5; j++){
//                System.out.println(index);  //-> print문이 25번 실행된것을 의미한다. 1~25까지 실행됨.
//                index++;
//            }// _j의 끝
//        }// _i의 끝

            for (int i = 2; i<=9; i++){
            System.out.print(i + "단" + "\t\t");
        }

        System.out.println();
            for (int i=1; i<=9; i++){
                for(int j=2; j<=9; j++){
                    System.out.print(j + "x" + i + "=" + (j*i) + "\t");
                }
                System.out.println();
            }

    }
}
