package FastCampus.Poly;

public class TV implements Remocon{
    // chUp() , chDown(), volUp(), volDown()
    @Override
    public void chUp() {
        System.out.println("TV의 채널을 올림");
    }
    @Override
    public void chDown() {
        System.out.println("TV의 채널 내림");
    }
    @Override
    public void volUp() {
        System.out.println("TV의 소리가 올라간다");
    }
    @Override
    public void volDown() {
        System.out.println("TV의 소리가 내려간다.");
    }

    @Override
    public void internet() {
        System.out.println("TV에서는 인터넷 됨");
    }
}
