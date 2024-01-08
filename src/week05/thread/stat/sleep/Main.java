package week05.thread.stat.sleep;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                Thread.sleep(2000);  // TIMED_WAITING(주어진 시간동안만 기다리는 상태)
                // Thread는 클래스 (sleep은 static 메서드로, Thread 클래스 자체를 잠들게 한다. 왜냐? static 메서드이기 때문에 어떤 객체를 지칭하는것이아님)
                // 객체.메서드();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");  // New 스레드 만들기  (thread 상태 : NEW)
        thread.start(); // thread를 start하는 순간.  NEW -> RUNNABLE 로 바뀐다.

        try {
            // 1초가 지나고 나면 runnable 상태로 변하여 다시 실행돼요!
            // 특정 스레드를 지목해서 멈추게 하는 것을 불가능해요!
            thread.sleep(1000); //  아래 코드랑 동일해서 노란 밑줄 생김
            // Thread.sleep(1000);

            System.out.println("sleep(1000) : " + Thread.currentThread().getName());


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}