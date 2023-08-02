package part2;

import model.CarDAO;
import model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // 자동차 정보를 키보드로부터 입력을 받아서 DB에 저장
        Scanner scan = new Scanner(System.in);
        System.out.print("자동차 일련번호: ");
        int carSn = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 이름: ");
        String carName = scan.nextLine();

        System.out.print("자동차 가격: ");
        int carPrice = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 소유자: ");
        String carOwner = scan.nextLine();

        System.out.print("자동차 연식: ");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 타입: ");
        String carType = scan.nextLine();

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();

    }
}
