package FastCampus.Java_0612_15;

import FastCampus.Poly.Radio;
import FastCampus.Poly.Remocon;
import FastCampus.Poly.TV;

public class InterfaceTest {
    public static void main(String[] args) {
        //리모콘으로 라디오와 티비를 동작시켜본다.
        Remocon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();

        remo = new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();

    }

}
