package week02.collection;

import java.util.ArrayList;

public class Col1_ArrayList {
    public static void main(String[] args) {
        // List (순서 있음, 중복 허용)
        // 순서가 있눈 데이터의 집합 => Array와 비슷
        // Array는 최초 길이를 알아야 하지만, List는 처음에 길이를 몰라도 만들 수 있다.

        // 1) Array -> 정적 배열
        // 2) List(ArrayList) -> 동적 배열 (크기가 가변적으로 늘어난다.)
            // - 생성 시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담아놓는다.
            // - 값이 추가될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장하니깐 상관없다!

        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 + 생성

        intList.add(99);
        intList.add(15);
        intList.add(3);

//        System.out.println(intList.get(1));
//        // 2번째 있는 값을 바꿔보자
//        intList.set(1, 50); // 첫번째 인덱스 값을 50으로 바꾸자.
//        System.out.println(intList.get(1));


        System.out.println(intList.get(0));
        // 삭제
        intList.remove(0);
        System.out.println(intList.get(0));

        System.out.println("클리어 전");
        System.out.println(intList.toString());
        intList.clear();
        System.out.println("클리어 후");
        System.out.println(intList.toString());
    }
}
