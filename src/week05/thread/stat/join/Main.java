package week05.thread.stat.join;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                Thread.sleep(5000); // 5초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(task, "thread");  // 만들면 NEW 상태

        thread.start(); //start하면 NEW -> RUNNABLE 상태

        long start = System.currentTimeMillis();

        try {
            // 시간을 지정하지 않았기 때문에 thread가 작업을 끝낼 때까지 main 쓰레드는 기다리게 됩니다.
            thread.join(); // 기본적으로 join을 하면 메인스레드는 해당 스레드가 종료될 때까지 기다리게 된다.

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // thread 의 소요시간인 5000ms 동안 main 쓰레드가 기다렸기 때문에 5000이상이 출력됩니다.
        System.out.println("소요시간 = " + (System.currentTimeMillis() - start));
    }
}