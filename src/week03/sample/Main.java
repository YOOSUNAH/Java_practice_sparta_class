package week03.sample;

public class Main {
    public static void main(String[] args) {
        Main main = new Main(); // 생성가능한 이유 ->
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());
    }

    // ->Main class안에는 기본 생성자가 들어있음. 생략이 가능해서 생략됨.
   // public Main(){}


    // 메서드

    public int getNumber(){
        // 지역 변수  <-> 전역변수
        // 해당 메서드가 실행될 때마다 독립적인 값을 저장하고 관리합니다.
        // 이 지역변수는 메서드 내부에서 정의될 때 생성되낟.
        // 이 메서드가 종료될 때 소멸된다.
        int number = 1;
        number += 1;  // number = number +1
        return number;
    }
}
