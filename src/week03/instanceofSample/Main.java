package week03.instanceofSample;

// 다형성

class Parent { } // 부모클래스
class Child extends Parent { }  // 자식클래스
class Brother extends Parent { } // 자식 클래스


public class Main {
    public static void main(String[] args) {

        Parent pc = new Child();  // 다형성 허용 (자식 -> 부모)

        Parent p = new Parent();

        System.out.println(p instanceof Object); // true 출력   p는 Objec의 인스턴스가 맞니?
        System.out.println(p instanceof Parent); // true 출력   p는 Parent의 인스턴스가 맞니?
        System.out.println(p instanceof Child);  // false 출력   p는 Child의 인스턴스가 맞니?
       // Child가 p(Parent p)의 인스턴스인게 맞다.

        Parent c = new Child(); // c는 child로 만든건데(근보적인타입) 형변화이 되어있는 것
        System.out.println(c instanceof Object); // true 출력 // Object는 최상단이 맞음.
        System.out.println(c instanceof Parent); // true 출력
        System.out.println(c instanceof Child);  // true 출력
        //형 변환은 했지만 new Child()로 만들었기때문에 true가 나온다.

    }
}