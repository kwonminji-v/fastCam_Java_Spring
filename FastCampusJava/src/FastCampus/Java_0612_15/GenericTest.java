package FastCampus.Java_0612_15;

import FastCampus.model.ObjectArr;

public class GenericTest {
    public static void main(String[] args) {

//        ObjectArr<String> array = new ObjectArr<>(5);
//
//        array.set(0, "Hello");
//        array.set(1, "World");
//        array.set(2, "Java");
//        array.set(3, "Generic");
//
//        for (int i=0; i<array.size(); i++) {
//            System.out.println(array.get(i));
//        }

        ObjectArr<Integer> array = new ObjectArr<>(5);

        array.set(0,123);
        array.set(1,456);
        array.set(2,789);
        array.set(3,101112);
        array.set(4,131415);
//        array.set(5,161718);

        for (int i=0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
