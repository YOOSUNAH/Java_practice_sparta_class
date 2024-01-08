package week05.thread;

public class Main {
    public static void main(String[] args) {
        // Thread 클래스 자체를 상속받는것
//        TestThread thread = new TestThread();  // 인스턴스화
//        thread.start();

        // Runnable interface를 implements 하는 것
//        Runnable run = new TestRunnable(); // 인스턴스화
//        Thread thread = new Thread(run);
//        thread.start();

        // 실제로는 람다식 을 많이 사용함.
        Runnable task = () -> {
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + " 최종 합 : " + sum);
        };

        Thread thread1 = new Thread(task);  // Thread에 task에 담는다.
        thread1.setName("thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }
}

