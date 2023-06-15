package Java_0612_15;

import Poly.A;
import Poly.B;

public class ObjectPolyArg {
    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);

    }

    private static void display(A a) {
        a.printGo();
    }
    private static void display(B b) {
        b.printGo();
    }
}
