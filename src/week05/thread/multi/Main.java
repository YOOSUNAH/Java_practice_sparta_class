package week05.thread.multi;

public class Main {
    public static void main(String[] args) {
        // 걸리는 시간이나, 동작을 예측할 수가 없다!!!

        // 1st
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };

        // 2nd
        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };


        Thread thread1 = new Thread(task);  // task로 thread로 만들고
        thread1.setName("thread1");
        Thread thread2 = new Thread(task2);  // task2를 thread로 만들고
        thread2.setName("thread2");

        thread1.start();
        thread2.start();  // thread1이 끝나고 thread2가 나오는게 아니라, 두 개의 쓰레드가 번갈아가면서 작업한다.
    }
}