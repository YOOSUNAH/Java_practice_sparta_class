package week03;

// 우리가 클래스르 만들기 위해서 4가지 STEP이 필요하다.
// 1. 만들려고 하는 설계도를 선언합니다. (클래스 선언)
// 2. 객체가 가지고 있어야 할 속성(필드)을 정의합니다.  (변수 형태)
// 3. 객체를 생성하는 방식을 정의합니다. (생성자)
// 4. 객체가 가지고 있어야 할 행위(메서드)를 정의합니다.

public class Car { // 1. 클래스 선언
    // <필드 영역>
    // 2. 필드를 정의 (변수 형태)

    //  (1) 고유데이터 영역
    String company; // 자동차 회사
    // (필드를 선언만 하고 할당X (: 초기화하지않음))
    String model = "Gv80" ; // 자동차 모델
    String color; // 자동차 색
    double price; // 자동차 가격
    //  (2) 상태 데이터 영역
    double speed; // 자동차 속도, km/h
    char gear; // 기어 상태(P, R, N, D)
    boolean lights = true; // 자동차 조명 상태

    //  (3) 객체 데이터 영역
    Tire tire = new Tire();  // new Tire 초기값을 준다. Car 클래스가 인스턴스화 될때, Tire 클래스에서도 인스턴스화를 시켜서 변수를 할당. (인스턴스화를 시킨다)
    Door door;
    Handle handle;


    // <생성자 영역>
    // 3. (생성자 Constructor) 객체를 생성하는 방식을 정의 (생성자 이름과 동일하게 가져가야 함)
    // 메서드는  접근제어자 return타입 을 써주는데 생성자는 return 타입을 쓰지 않는다.
    // 생성자 : 처음 객체가 생성될 때 (instance화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의!
    public Car() {
        // logic
        // 기본 생성자 : 생략이 가능

        System.out.println("생성자가 호출되었습니다! 객체가 생성됩니다.");
    }

    // <메서드 영역>
    // 메서드
    // gasPedal
    // input : km/h
    // output : speed
    double gasPedal(double kmh, char type) {
        changeGear(type); // 가속도 페달을 밟으면 자동으로 기어가 변한다.
        speed = kmh;
        return speed;
    }

    // brakePedal
    // input : x
    // output : speed
     double brakePedal(char type) {
        speed = 0;
        return speed;
    }

    // changeGear
    // input : gear(char type)
    // output : gear(char)
    char changeGear(char type) {
        gear = type;
        return gear;
    }

    // onOffLight
    // input : x
    // output : lights (boolean)
    boolean onOffLight() {
        lights = !lights;
        return lights;
    }

    // horn :
    // input : x
    // output : x
    void horn() {
        System.out.println("빵빵!");
        }

        // 자동차의 속도 .. 가변길이 메서드
    void carSpeeds(double ... speeds){
        for (double v : speeds){
            System.out.println("v = " + v);
        }
    }
}
