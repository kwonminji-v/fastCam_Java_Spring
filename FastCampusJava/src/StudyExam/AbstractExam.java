package StudyExam;


abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("현재 위치에 정지!");
    }
}
class Marine extends Unit {
    void move(int x, int y){
        System.out.println("마린 [ x = " + x + ",y = " + y + "]");
    }
    void stimpack() {
        System.out.println("스팀팩을 사용해!");
    }
}
class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("탱크 [x = " + x + ",y=" + y + "]");
    }
    void changeMode() {
        System.out.println("공격모드로 변환하라!");
    }
}
class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("드랍쉽[X = " + x + ",Y = " + y + "]");
    }
    void load(){
        System.out.println("선택한 대상을 태운다");
    }
    void unload() {
        System.out.println("선택된 대상을 내린다.");
    }
}
public class AbstractExam {
    public static void main(String[] args) {
        Unit[] group = { new Marine() , new Tank(), new Dropship()};

        //상위 클래스로
        Unit unit = new Dropship();
        ((Dropship)unit).unload();

        Dropship drop = new Dropship();
        drop.load();

        for(int i = 0; i < group.length; i++) {
            group[i].move(100,200);
        }
    }
}
