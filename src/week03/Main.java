package week03;

public class Main {
    public static void main(String[] args) {
//        Car car0 = new Car(); // 생성자를 호출, 인스턴스를 만듦
//
//        System.out.println(car0); // car1이 가진 주소가 나옴 week03.Car@372f7a8d
//        // 참조형 변수 저장할 때 별도 공간 저장하고 그 주소를 가져온다
//        // 객체도 별도 공간에 저장하고 그 주소를 가져온다.
//
//        Car[] carArray = new Car[3];
//        Car car1 = new Car();
//        car1.changeGear('P');
//        carArray[0] = car1;
//
//        Car car2 = new Car();
//        car2.changeGear('N');
//        carArray[1] = car2;
//
//        Car car3 = new Car();
//        car3.changeGear('D');
//        carArray[2] = car3;
//
//        for (Car car: carArray) {
//            System.out.println("car.gear= " + car.gear);
//        }


//        Car car = new Car();  // 객체 생성
//        // 초기값 기본 값 확인 : 초기값을 준 것은 그 값이 들어가고, 아닌 값은 default value가 set
//        System.out.println("car.model = " + car.model); // 초기화 해둠
//        System.out.println("car.color = " + car.color);
//        System.out.println();
//
//        System.out.println("car.speed = " + car.speed);
//        System.out.println("car.gear = " + car.gear);
//        System.out.println("car.lights = " + car.lights); // 초기화 해둠
//        System.out.println();
//
//        System.out.println("car.tire = " + car.tire); // 초기화 해둠, // 주소로
//        System.out.println("car.door = " + car.door);
//        System.out.println();
//
//        // 필드 사용
//        car.color = "blue"; // 필드 coloar에 "blue" 데이터를 저장
//        car.speed = 100;
//        car.lights = false;
//
//        System.out.println("car.color = " + car.color);
//        System.out.println("car.speed = " + car.speed);
//        System.out.println("car.lights = " + car.lights);
//
//        // 메서드는 행위를 얘기한다.
//        // 행위는 객체간의 협력을 위해서도 사용된다.


        Car car = new Car();  // 객체 생성

        System.out.println("페달 밟기 전 car.gear = " + car.gear);
        // 메서드 호출 및 반환값을 저장
        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLight();
        System.out.println("lights = " + lights);

        System.out.println();
        System.out.println("페달 밟고 난 후의 car.gear = " + car.gear); // D

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);





    }
}


