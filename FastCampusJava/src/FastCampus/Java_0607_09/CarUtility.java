package FastCampus.Java_0607_09;


import FastCampus.model.CarDTO;
import FastCampus.model.CarUtilit;

public class CarUtility {
    public static void main(String[] args) {
        //Q.자동차 정보를 출력하는 기능을 가지고 있는 Utility 클래스를 설계해보자
        //아래는 개별로 6개의 변수를 이용해서 자동차 정보를 나타낸 것이다, 하나의 덩어리 구조는 아니다. 각각의 변수로 선언된 것임!
        int carSN = 1110;
        String carName = "소나타";
        int carPrice = 50000;
        String carOwner = "권민지";
        int carYear = 2010;
        String carFlue = "G";


        // 상단에서 개별로 선언된 데이터들을 하나로 담아서 이동을 하기 위해서!

        CarDTO car = new CarDTO();

        car.carSN = carSN;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carFlue = carFlue;
        CarUtilit carUtil = new CarUtilit();  // 현재 상태변수를 갖고 있는것이 아니라 동작만 가지고 있는 메서드이다.
        carUtil.carPrint(car);

        //carPrint(car);
        //carPrint메서드를 호출한 후 ( )안에 car의 정보를 넘겨준다.
        // car가 위에 car.으로 선언된 데이터들을 받아가지고 해당 메서드 내부에서 출력이 하도록 작성한다.
    }
    //매개변수로 자동차의 정보를 입력 받아서 출력하는 메서드를 정의하세요
    //이번엔 키보드로부터 입력받은 것이 아니라,

}
