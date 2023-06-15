package FastCampus.model;

public class CarUtilit {
    public void carPrint(CarDTO car) {
        System.out.println("자동차넘버:"+car.carSN+"\t"+"자동차이름:"+car.carName+"\t"+"자동차가격:"+car.carPrice+"\t"+"자동차 소유주 :" +car.carOwner+"\t" +"자동차 연식 : " +car.carYear+"\t" +"자동차 연비 : " +car.carFlue);
    }
}
