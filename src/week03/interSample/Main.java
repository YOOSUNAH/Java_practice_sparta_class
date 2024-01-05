package week03.interSample;

public class Main {
    public static void main(String[] args) {

        // A 인터페이스에 구현체 B 대입
        A a1 = new B();  // B를 생성하고 나면 A로 자동 형변환 (B가 A를 implement해서)
        a1.a();  // A 인터페이스가 가지고 있던 메서드 a()를 호출할 수 있음. // B가 오버라이드 한걸로 호출이 됨.
        // a1.b(); // 불가능
        // 자동 형변환된 a1 객체는 B가 implement해서 오버라이드 한 메서드 a()는 가지고 있지만,
        // 그냥 본인이 만든 메서드 b는 A인터페이스에 없기 때문에 메서드 b()는 가지고 있지 않다!!  (A로 형변환되었으니깐)
        // (Teacher) a1은 인터페이스 A 타입(자동형변환)이기 때문에, a() 메서드만 가지고 있음!

        System.out.println("\nB 강제 타입변환");
        B b = (B) a1;   // 다시 변환했다가!! 해야 강제타입변환이 가능하다!!
        b.a();
        b.b(); // 강제 타입변환으로 사용 가능
        System.out.println();

        // A 인터페이스에 구편체 B를 상속받은 C 대입
        A a2 = new C(); // a2선언 후, C생성자를 통해서 만듦
        // (원래) C가 가질 수 있는 건 오버라이드 받은 a(), b(), 본인의 c()를 가질 수 있지만...
        // 그런데 A로 자동형변환 되어서 a()만 가질 수 있다!

        a2.a();
        //a2.b(); // 불가능
        //a2.c(); // 불가능  -> 쓰고 싶다면 아래와 같이 해야함.

        System.out.println("\nC 강제 타입변환");
        C c = (C) a2;   // 다시 변환했다가!!
        c.a();
        c.b(); // 강제 타입변환으로 사용 가능
        c.c(); // 강제 타입변환으로 사용 가능


    }
}

interface A {
    void a();
}
class B implements A {
    @Override
    public void a() {
        System.out.println("B.a()");
    }

    public void b() {   // A 인터페이스는 이걸 가지고 있지 않지.
        System.out.println("B.b()");
    }
}
class C extends B {  // C는 B를 상속받았고, B는 A를 implement함.
    // (원래) C가 가질 수 있는 건 오버라이드 받은 a(), b(), 본인의 c()를 가질 수 있다.)
    public void c() {
        System.out.println("C.c()");
    }
}