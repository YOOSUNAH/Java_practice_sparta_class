import java.util.Arrays;
import java.util.Scanner;
// import : im(in) + port(항구) : 안쪽 항구로 가져온다 : 수입 : (Main.java코드 안쪽으로) 밖에서부터 reosource를 가져온다.

// 클래스
// public : 접근 제어자.  public(공공의, 공통의) 어디서든 접근이 가능한.
public class Main {
    // JDK의 기능, 역할
    // (1) compiler 컴파일러 역할 : .java -> .class
    // (2) JRE 자바 실행환경을 가지고 있다.
    // (3) JDB : 디버깅 역할을 가지고 있다.

    // main 메서드
    // 모든 프로젝트를 만들 때 메인 메서드가 반드시 있어야 한다.
    // why? 자바 프로젝트(앱)는 제일 먼저 클래스의 main 메서드를 실행시킨다. = JVM의 약속
    // static : 이 프로그램이 시작 될 때 무조건 실행이 된다 는 걸 표현

    // output
    // 메서드 이름 앞(여기에서는 void) : 메서드의 출력값의 데이터 타입
    // void : 아무것도 없다 -> 출력은 없다.

    // input
    // 메서드 이름 뒤에 소괄호 (여기에서는 (String[] args)) : 매개 변수 자리
    // main이라는 메서드를 호출 할 때 input은 무엇으로 할꺼냐.
    // input의 타입은 String 타입. args라는 변수명

    // 접근제어자 (static) output 메서드명(input)
    public static void main(String[] args) {  // 메서드 (소괄호 바로 앞에 있는게 이름) 즉 main 메서드

        // 객체 : 특징(속성, 변수)과 행동(메서드)을 가진다.
        // 하위요소를 표현할 때 (.)온점으로 표현
        // system이라는 class 안에 있는 out이라는 것 안에 있는 행동을 통해서 문자열을 출력(print)한다.
        // out 이라는 객체이고 println이라는 메서드를 포함하고 있다.
        System.out.println("sparta first java project!");
        // ("sparta first java project!") 라는 input을 넣어 메서드를 실행했다.
        // input을 넣어 out이라는 객체는 출력하는 기능을 수행함.

        // print 메서드 -> 줄 바꿈을 하지 x
        // println 메서드 -> 줄 바꿈 o
        // ln : line

        System.out.println(7); // 숫자는 따옴표 없이 써도 된다.
        System.out.println(3);
        System.out.println(3.14);
        System.out.println("JAVA");  // 문자는 쌍따옴표가 필수다.
        System.out.println("--------------------");
        // -----------------------------------------------------
        // 변수를 선언해보자 => 타입 이름 = 값;

        // 기본형 변수
        // (1) boolean
        boolean flag = true;  // 선언과 동시에 값을 저장
        // boolean flag = 1; 은 오류가 남 1은 정수니깐, true or false 만 올수있음
        flag = false; // 값 덮어쓰기

        System.out.println(flag);

        // (2) 문자형 (char)
        char alphabet = 'A'; // 작은 따옴표로 해야함
        System.out.println(alphabet);

        // (3) 정수형 (byte, short, int, long)
        byte byteNumber = 127;  // -128 ~ 127 (1byte)
        short shortNumber = 32767; // -32,768 ~ 32,767 (2byte)
        int intNumber = 2147483647;  // -21억~21억 (2147483647) (4byte)
        long longNumber = 2147483647L; //  9백경 정도(2147483647L) (8byte)

        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(intNumber);
        System.out.println(longNumber);

        // (3) 실수형 (float, double)
        float floatNumber = 0.123f;             // (4byte)
        double doubleNumber = 0.1231231232;  // (8byte)
        // 변수를 할당하고 뒤에서 쓸 수 있다.
        // (변수를) 참조한다.(=쓸 수 있다.) // 변수를 가져다 쓰는 걸 참조한다고 말한다.
        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        // 참조형 변수
        // (1) 문자열 변수
        String helloWorld = "HelloWorld";
        System.out.println(helloWorld);

        // (2) 배열
        int[] array = {1, 2, 3};
        System.out.println(array); // [I@4517d9a3 가 출력됨
        // 참조형 데이터는 주소값을 저장해서 주소값이 출력됨.

        // 실제 값을 출력하고 싶다면
        System.out.println(Arrays.toString(array)); // [1, 2, 3] 출력
        // Arrays 라는 자바에서 제공하는 util 이 있음 array를 String으로 바꿔주는 기능을 이용

        // Wrapper class 변수
        int number = 21;
        Integer num =  number;  // boxing
        System.out.println(num.intValue()); // unboxing. 21이 출력됨.

        System.out.println("--------------------");
        // -----------------------------------------------------
        // 숫자 -> 문자
//            Scanner sc = new Scanner(System.in);  // 97을 입력하면
//
//            int asciiNumber = sc.nextInt(); // 아스키 넘버에 97이 할당됨.
//            char ch = (char)asciiNumber; // 문자로 형변환을 해주면 숫자에 맞는 문자로 표현된다. // (char)변수타입으로 바꿈
//
//            System.out.println(ch);  // a가 출력됨.

        //문자 -> 숫자
        Scanner sc = new Scanner(System.in);  // a를 입력하면

        char letter = sc.nextLine().charAt(0); // 첫번째 글자만 받아오기위해 charAt(0) 메서드를 사용합니다.
        int asciiNumber = (int)letter; // 숫자로 형변환을 해주면 저장되어있던 아스키 숫자값으로 표현됩니다.

        System.out.println(asciiNumber);  // 97이 출력됨.

    }
}

