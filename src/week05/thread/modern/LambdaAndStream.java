package week05.thread.modern;

import java.util.ArrayList;
import java.util.List;

// 주차장 예제
// 티켓, 파켕머니만 있는 차량만 -> 주차하게 하는
public class LambdaAndStream {
    public static void main(String[] args) {
        // 주차 대상 차랑
        ArrayList<Car> carsWantToPark = new ArrayList<>();

        // 주차장
        ArrayList<Car> parkingLot = new ArrayList<>();

        // 주말 주차장 (돈, 티멧 둘다 있어야 한다)
        ArrayList<Car> weekendParkingLot = new ArrayList<>();

        // 5개의 car instance 를 만듦
        Car car1 = new Car("Benz", "Class E", true, 0);
        Car car2 = new Car("BMW", "Series 7", false, 100);
        Car car3 = new Car("BMW", "X9", false, 0);
        Car car4 = new Car("Audi", "A7", true, 0);
        Car car5 = new Car("Hyundai", "Ionic 6", false, 10000);

        carsWantToPark.add(car1);
        carsWantToPark.add(car2);
        carsWantToPark.add(car3);
        carsWantToPark.add(car4);
        carsWantToPark.add(car5);

        //parkingLot.addAll(parkingCarWithTicket(carsWantToPark));
        // 매개변수로 함수를 넘겨주는 새로운 방법
        parkingLot.addAll(parkCars(carsWantToPark, Car::hasTicket));

        // parkingLot.addAll(parkingCarWithMoney(carsWantToPark));
        parkingLot.addAll(parkCars(carsWantToPark, Car::noTicketButMoney));

        // 익명함수 적용해보기 (람다 문법 적용해보기 () -> {} // 이것도 한줄이면 {} 생략 가능
        parkingLot.addAll(parkCars(carsWantToPark, (Car car)->car.hasParkingTicket() && car.getParkingMoney() > 1000));

        for (Car car : parkingLot) {
            System.out.println("Parked Car : " + car.getCompany() + "-" + car.getModel());
        }
    }

    // 타입!!! -> (함수형) 인터페이스
    // 인터페이스는 타입 역할을 할 수 있기 때문!
    // 함수형 인터페이스 : 추상 메서드를 딱 하나만 가지고 있음!!
    // 인터페이스 만들기   (맨 밑에)
//    public exampleMethod(int parameter1,  parameterFunction){  // 함수는 타입을 어떻게 써야 할까?
//        parameterFunction
//    }


    // 아래 두개의 메서드가 비슷하니 하나로 합쳐보자
//    public static List<Car> parkingCarWithTicket(List<Car> carsWantToPark) {
//        ArrayList<Car> cars = new ArrayList<>();
//
//        for (Car car : carsWantToPark) {
//            if (car.hasParkingTicket()) {  //티멧이 있으면
//                cars.add(car);   // 저장
//            }
//        }
//        return cars;
//    }
//
//    public static List<Car> parkingCarWithMoney(List<Car> carsWantToPark) {
//        ArrayList<Car> cars = new ArrayList<>();  // return 할 cars를 선언
//
//        for (Car car : carsWantToPark) {
//            if (!car.hasParkingTicket() && car.getParkingMoney() > 1000) {  // 티멧은 없지만 돈이 있는 차량
//                cars.add(car);
//            }
//        }
//
//        return cars;
//    }
    // 위 두 메서드를 하나로! : 내부 주요 로직을 함수로 전달받자
    public static List<Car> parkCars(List<Car> carsWantToPark, Predicate<Car> function){
        List<Car> cars = new ArrayList<>();

        for(Car car : carsWantToPark){
            // 전달된 함수를 사용하여 구현
            if (function.test(car)){
                cars.add(car);
            }
        }
        return cars;
    }

}

class Car {
    private final String company; // 자동차 회사
    private final String model; // 자동차 모델

    private final boolean hasParkingTicket;
    private final int parkingMoney;

    public Car(String company, String model, boolean hasParkingTicket, int parkingMoney) {
        this.company = company;
        this.model = model;
        this.hasParkingTicket = hasParkingTicket;
        this.parkingMoney = parkingMoney;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public boolean hasParkingTicket() {
        return hasParkingTicket;
    }

    public int getParkingMoney() {
        return parkingMoney;
    }
    public static boolean hasTicket(Car car){
        return car.hasParkingTicket;
    }
    public static boolean noTicketButMoney(Car car){
        return !car.hasParkingTicket && car.getParkingMoney() > 1000;
    }

}

interface Predicate<T>{
    boolean test(T t); // 메서드 추가
}