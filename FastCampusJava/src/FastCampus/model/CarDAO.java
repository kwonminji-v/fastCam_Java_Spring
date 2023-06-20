package FastCampus.model;

//어떠한 클래스 뒤에 DAO가 붙어있으면 아래의 carDAO로 예를 들면 자동차와 관련되어있는 데이터 베이스를 연결해서 CRUD 역할을 하는 클래스라고 인지가 가능하다.
public class CarDAO {
    //C.R.U.D의 기능을 만들어보자
    //Create = insert (저장)
    public void carInsert(CarDTO car) {
        //DB를 연결하고, insert SQL명령문을 작성하여 자동차 정보를 DB에 저장해본다.
        System.out.println("car 정보가 DB에 저장되었습니다.");
    }

    public void carSelect() {
        //DB연결, select SQL
        System.out.println("car 정보가 출력이 되었습니다.");
    }

}
