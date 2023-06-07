package Java_0607_09;

import model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //Q. 자동차의 정보를 [키보드로부터 입력] 받아서 [다른 메서드]로 이동해야 하는 경우를 생각해보자


        Scanner scan = new Scanner(System.in);

        System.out.print("자동차의 일련번호를 입력해주세요 = ");
        int carSN = scan.nextInt();
        scan.nextLine();

        System.out.print("자동차의 이름을 입력해주세요 = ");
        String carName = scan.nextLine();

        System.out.print("자동차의 가격을 입력해주세요 = ");
        int carPrice = scan.nextInt();
        scan.nextLine();

        System.out.print("자동차의 소유자의 이름을 입력해주세요 = ");
        String carOwner = scan.nextLine();

        System.out.print("자동차의 연식을 입력해주세요 = ");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차의 타입을 입력해주세요 = ");
        String carFlue = scan.nextLine();

//   System.out.println("자동차넘버:"+carSN+"\t"+"자동차이름:"+carName+"\t"+"자동차가격:"+carPrice+"\t"+"자동차 소유주 :" +carOwner+"\t"+carYear+"\t"+carFlue);
        //자동차 데이터를 이동하기 위한 바구니가 필요하다 (DTO, VO)
        //클래스로 CarDTO, CarVo 모델을 설계하여 데이터를 묶어 데이터의 이동이 수월해진다.

        CarDTO car = new CarDTO();
        car.carSN = carSN;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carFlue = carFlue;
        carInfoprint(car);

        //상단에서 선언된 각 변수의 데이터들이 하단의

    }
    //Q. [매개변수로 자동차의 정보를 받아서] [출력하는] [메서드를 정의]하세요.
    public static void carInfoprint(CarDTO car) {
        System.out.println("자동차넘버:"+car.carSN+"\t"+"자동차이름:"+car.carName+"\t"+"자동차가격:"+car.carPrice+"\t"+"자동차 소유주 :" +car.carOwner+"\t" +"자동차 연식 : " +car.carYear+"\t" +"자동차 연비 : " +car.carFlue);
                
    }
}
