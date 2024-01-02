package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4_Queue {
    public static void main(String[] args) {
        // Queue
        // FIFO
        // add, peek, poll
        // Queue : 생성자가 없는 인터페이스라서, new 키워드로 생성할 수 없다.
        Queue<Integer> intQueue = new LinkedList<>();

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while(!intQueue.isEmpty()){
            System.out.println(intQueue.poll());
        }
        intQueue.add(1); // 제일 먼저 넣음  -> 먼저 나옴, 먼저 조회됨. FIFO
        intQueue.add(5);
        intQueue.add(9);
        intQueue.add(10);


        System.out.println("-------");
        // peak
        System.out.println(intQueue.peek());  // `
        System.out.println(intQueue.size()); // 4
    }
}
