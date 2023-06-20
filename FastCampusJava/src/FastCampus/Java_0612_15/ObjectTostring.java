package FastCampus.Java_0612_15;

import FastCampus.Poly.BoardVO;

public class ObjectTostring {
    public static void main(String[] args) {

        BoardVO b = new BoardVO();

        b.setTitle("게시글 입니다.");
        System.out.println(b.getTitle());

        System.out.println(b.toString());
    }
}
