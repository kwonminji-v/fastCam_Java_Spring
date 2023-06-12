package Java_0607_09;

import model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {

        MemberDTO m = new MemberDTO();
        m.name = "권민지";
        m.phone = "010-1234-5678";

        System.out.println("m.age = " + m.name);
        m.play();

    }
}
