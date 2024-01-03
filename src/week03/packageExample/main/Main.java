package week03.packageExample.main;


import week03.packageExample.pk1.Car;

public class Main {
    public static void main(String[] args) {

//        import 안하고 전체 경로를 명시해서 클래스에 접근하는 방법
         // 클래스의 일부분이며, 하위 패키지를 도트(.)로 구분한다.
//        week03.packageExample.pk1.Car car1 = new week03.packageExample.pk1.Car();
//        week03.packageExample.pk2.Car car2 = new week03.packageExample.pk2.Car();
//
//        car1.horn();
//        car2.horn();

        // import 하는 방법
        Car car = new Car();
        week03.packageExample.pk2.Car car2 = new week03.packageExample.pk2.Car();  // 둘다 이름이 같아서 둘다 import 할 순 없음.
        car.horn();

    }
}
