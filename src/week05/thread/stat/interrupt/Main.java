package week05.thread.stat.interrupt;

//public class Main {
//    public static void main(String[] args) {
//        // 쓰레드가 start() 된 후 동작하다 interrupt()를 만나 실행하면 interrupted 상태가 true 됩니다.
//        Runnable task = () -> {
//            try {
//                // sleep 도중 ㅑnterrupt 발생시, catch!
//                Thread.sleep(1000);
//
//                //  thread.interrupt(); 때문에 아래 코드는 다 실행되지 못하고, catch문으로 빠져버린다.
//                System.out.println(Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("task : " + Thread.currentThread().getName());
//        };
//
//        Thread thread = new Thread(task, "Thread");  // NEW
//        thread.start(); // NEW -> Runnable
//
//        thread.interrupt();  // sleep를 방해하고 다시 실행대기 상태로 만들어 버림
//
//        // 스레드에서 제공하는 메서드 :isInterrupted.  현재 스레드가 interrupted된 상태인지를 return 해줌.
//        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
//
//    }
//}


public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            // 이렇게 하면, catch문으로 도중에 안빠짐
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        thread.interrupt();

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

    }
}