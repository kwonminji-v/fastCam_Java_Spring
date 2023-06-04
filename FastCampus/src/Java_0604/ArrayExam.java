package Java_0604;

public class ArrayExam {
    public static void main(String[] args) {
        char[] c = {'A','P','P','L','E'};

        for (int i = 0; i < c.length; i++) {
            c[i] = Character.toLowerCase(c[i]);
            System.out.print(c[i]);
        }
    }
}
