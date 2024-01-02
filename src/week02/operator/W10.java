package week02.operator;

public class W10 {
    public static void main(String[] args) {
        // 비트 연산
        // (2) 표기는 이 숫자가 이진수값이라는 표식

        System.out.println(3 << 2);
        //  3의 이진수값은 11(2) 12의 이진수값은 1100(2)
        // 3의 이진수값인 11(2) 에서 왼쪽으로 2번 옮겨져서 1100(2) 인 12값이 된다.

        System.out.println(3 >> 1);
        // 3의 이진수값인 11(2) 에서 오른쪽으로 1번 옮겨져서 1(2) 인 1 값이 된다.
    }
}
