package week03.inter_0;

public class Main extends D implements C {
    // extends D : D라는 클래스를 상속 받는다.
    //  implements C: C라는 인터페이스를 구현한다.

    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
        System.out.println("B");
    }

    @Override
    void d() {
        super.d();  // 오버라이드 함 super의 d를 출력하게끔 (결국 동일)
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.a();
        main.b();
        main.d();
    }
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C extends A, B {  // A인터페이스, B인터페이스를 상속받는 인터페이스다.
    // 그래서 A가 가지고 있는 void a, B가 가지고 있는 void b를 모두 담고 있다.
    // 구현체가 될 수 있다.
    // void a랑 b를 오버라이드 받을 수 있다.
}

class D {  // d라는 메서드를 가지고 있는 클래스 D
    void d() {   // 위에서   오버라이드 함
        System.out.println("D");
    }
}