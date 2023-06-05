package Java_0604;

public class ObjectArrayExam {
    public static void main(String[] args) {
        //Q. 영화 3편을 저장 할 [배열을 생성]하고 영화 3편의 데이터를 저장하고 출력
        Movie[] m = new Movie[3]; //-> 영화 3편을 저장할 기억 공간만 만들어 둔 상태
        m[0] = new Movie();
        m[0].mtitle = "아이언맨";
        m[0].mmajor = "로다주";
        m[0].mtime = 160;
        m[0].mlevel = 15;
        m[0].mday = "2023.06.05";
        //영화 1편의 데이터를 메모리에 저장해둔 것 -> m[0]가 영화 1편이 된다.

        m[1] = new Movie();
        m[1].mtitle = "캡틴아메리카";
        m[1].mmajor = "크리스에반스";
        m[1].mtime = 120;
        m[1].mlevel = 15;
        m[1].mday = "2023.06.21";


        m[2] = new Movie();
        m[2].mtitle = "블랙위도우";
        m[2].mmajor = "스칼렛요한슨";
        m[2].mtime = 130;
        m[2].mlevel = 15;
        m[2].mday = "2023.05.05";

        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].mtitle + "\t" + m[i].mmajor + "\t" + m[i].mtime + "\t" + m[i].mtime + "\t" + m[i].mlevel + "\t" + m[i].mday);
        }
    }
}
//변수 m을 이동해서 영화 3편을 다른 쪽에서 사용할 수 있다. m이 [0],[1],[2]를 담고 있기 때문이다.
