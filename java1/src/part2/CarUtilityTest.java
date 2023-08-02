package part2;

import model.CarDTO;
import model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Q. Car 정보를 출력하는 동작을 가지고 있는 Utility class를 설계하라
        int carSn = 1110;
        String carName = "BMW828";
        int carPrice = 9000000;
        String carOwner = "홍길동";
        int carYear = 2015;
        String carType = "G";

        // 데이터를 하나로 묶기
        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;
        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car);
    }
}
