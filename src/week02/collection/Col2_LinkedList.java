package week02.collection;

import java.util.LinkedList;

public class Col2_LinkedList {
    public static void main(String[] args) {
        // Linked List
        // 메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제 값을 담아놔요.
        // 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조.

        // 기본적 기능은 -> ArrayList와 동일!
        // LinkedList는 값 -> 여기 저기 나누어서 : 조회하는 속도가 "느리다..."
        // 값을 추가하거나, 삭제할 때는 빠릅니다.

        LinkedList<Integer> linkednList = new LinkedList<Integer>();

        linkednList.add(5);
        linkednList.add(10);
        linkednList.add(3);

        System.out.println(linkednList.get(0));
        System.out.println(linkednList.get(1));
        System.out.println(linkednList.get(2));


        System.out.println(linkednList.toString()); // 이렇듯 조회할 때는 arrayList보다 속도가 현저히 느리다.

        linkednList.add(200);
        System.out.println(linkednList.toString());

        linkednList.add(2, 4);
        System.out.println(linkednList.toString());

        linkednList.set(1, 30);
        System.out.println(linkednList.toString());

        linkednList.remove(1);
        System.out.println(linkednList.toString());

        linkednList.clear();
        System.out.println(linkednList.toString());


    }
}
