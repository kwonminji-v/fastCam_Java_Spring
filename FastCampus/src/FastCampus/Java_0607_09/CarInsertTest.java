package FastCampus.Java_0607_09;

import FastCampus.model.CarDAO;
import FastCampus.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        //자동차 정보를 키보드로부터 입력을 받아서 데이터 베이스에 저장을 해라.
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


        CarDTO car = new CarDTO();
        car.carSN = carSN;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carFlue = carFlue;

        CarDAO carDAO = new CarDAO();
        carDAO.carInsert(car);
        carDAO.carSelect();

    }

}
/*
carDAO.carInsert(car)에서 매개변수로 car를 입력하는 이유는 carInsert() 메서드의 시그니처에 맞게 데이터를 전달하기 위해서입니다. carInsert() 메서드는 CarDTO 객체를 매개변수로 받아서 해당 객체에 저장된 자동차 정보를 데이터베이스에 저장하는 역할을 수행합니다. 따라서 carDAO.carInsert(car)는 입력받은 자동차 정보를 car 객체에 저장한 후, car 객체를 carInsert() 메서드에 전달하여 데이터베이스에 저장합니다.

반면에 carDAO.carSelect()는 매개변수를 입력하지 않는 이유는 해당 메서드에서는 데이터베이스로부터 자동차 정보를 조회하는 기능만을 수행하기 때문입니다. 자동차 정보를 조회하는 데에는 별다른 매개변수가 필요하지 않기 때문에 carDAO.carSelect()처럼 매개변수를 입력하지 않습니다.
*/
