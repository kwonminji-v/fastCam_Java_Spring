package Poly;

public class Radio extends Remocon {
    // chUp() , chDown(), volUp(), volDown()
    @Override
    public void chUp() {
        System.out.println("라디오의 채널을 올림");
    }

    @Override
    public void chDown() {
        System.out.println("라디오의 채널 내림");
    }

    @Override
    public void volUp() {
        System.out.println("라디오의 소리가 올라간다");
    }

    @Override
    public void volDown() {
        System.out.println("라디오의 소리가 내려간다.");
    }


}
