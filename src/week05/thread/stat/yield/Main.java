package week05.thread.stat.yield;

// 남은 시간을 다음 쓰레드에게 양보하고 쓰레드 자신은 실행대기 상태가 됨.
// thread1 과 thread2가 같이 1초에 한번씩 출력되다가
// 5초뒤에 thread1에서 InterruptedException이 발생하면서
// Thread.yield(); 이 실행되어 thread1은 실행대기 상태로 변경되면서 남은 시간은 thread2가 양보된다.
public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                // 1초동안 기다리는 작업을 for문을 돌며 열번을 한다. 다끝나려면 10초가 되어야 한다.
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {  // for문을 다 돌리지 못하고, interrupt가 발생했기 때문
                Thread.yield(); // 자기는 실행대기 상태로 돌아가면서, resource를 양보한다.
            }
        };

        Thread thread1 = new Thread(task, "thread1");
        Thread thread2 = new Thread(task, "thread2");

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 10초가 되기 전에 interrupt를 해버리니깐
        //interrupt 특징 : 실행되고 있는 것을 실행대기 상태로 바꿔버림.
        thread1.interrupt();
        // thread1은 5초가 지나고 나서는 interrupt가 되어, 중간에 thread1은 멈추고,
        // thread1은 모든 resource를 양보하고, 본인은 실행대기 상태로 돌아간다.
    }
}