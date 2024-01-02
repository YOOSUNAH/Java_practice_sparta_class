package week02.operator;

public class W06 {
    public static void main(String[] args) {
        // 대입 연산자에서 주의 해야 할 점!!
        // ++, -- 를 사용할 때
        int a = 10;
        int b = 10;
        int val = ++a + b--;  // 11 + 9 = 20 예상하지만 아님.
        System.out.println(a); // 11
        System.out.println(b); // 9
        System.out.println(val); // 21
        // ++, -- 앞에 있으면  ++가 붙은 값을 대체한 다음에 한줄이 실행이 되고 다음줄로 넘어간다.
        // a 에 +1을 한 값을 대입하고 한줄을 실행한 다음 b에 -1을 해줘 가 된다.

        val = ++a + --b; // 이렇게해야 11 + 9 = 20 와 같이 계산됨
        System.out.println(val);

    }
}
