package week02.collection;

import java.util.Stack;

public class Col3_Stack {
    public static void main(String[] args) {
        // Stack
        // 수직으로 값을 쌓아 놓고, 넣았다가 뺀다.  FILO (Basket)
        // push , peek, pop
        // 최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복처리를 막고 싶을때 사용
        Stack<Integer> intStack = new Stack<Integer>(); // 선언 및 생성

        intStack.push(10);  // 제일 먼저 쌓임 -> 제일 나중에 pop됨
        intStack.push(15);
        intStack.push(1);  // 제일 나중에 쌓임 -> 제일 먼저 pop됨

        // 다 지워질때까지 출력
        while(!intStack.isEmpty()){
            System.out.println(intStack.pop());
        }

        System.out.println("------");

        intStack.push(10);  // 제일 먼저 쌓임 -> 제일 나중에 나옴
        intStack.push(15);
        intStack.push(1);  // 제일 나중에 쌓임  -> 제일 먼저 나옴

        // peak  (맨 위의 값을 조회한다)
        System.out.println(intStack.peek()); // 1

    }
}
