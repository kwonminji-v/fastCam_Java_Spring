package Java_0604;

public class Operation {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        
        int min = (a<b) ? a : b;
        System.out.println("min = " + min);
        
        int max = (a>b) ? a: b;
        System.out.println("max = " + max);
    }
}
