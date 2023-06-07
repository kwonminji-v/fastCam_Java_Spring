package model;

//class를 선언할 때는 꼭  public으로 선언해주어야 한다.
public class MemberDTO {
    public String name;
    private int age;  //정보 은닉!
    public String phone;
    public String email;
    public String addr;
    public float weight;

    public void play() {
        System.out.println("운동을 한다.");
    }
}
