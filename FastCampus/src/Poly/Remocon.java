package Poly;

public abstract class Remocon {
    // chUp() , chDown(), volUp(), volDown()
    public abstract void chUp();
    public abstract void chDown();
    public abstract void volUp();
    public abstract void volDown();

    public void internet() {
        System.out.println("구현메서드 : 인터넷이 지원된다");
    }
}
