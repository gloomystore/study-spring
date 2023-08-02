package model;

public class CarUtility {
    // 매개변수로 자동차의 정보를 입력 받아서 출력하는 메소드 정의
    public static void carPrint(CarDTO car) {
        System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);
    }
}
