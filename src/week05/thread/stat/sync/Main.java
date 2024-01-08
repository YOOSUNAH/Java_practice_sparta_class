package week05.thread.stat.sync;

public class Main {
    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore();

        Runnable task = () -> {
            while (appleStore.getStoredApple() > 0) {
                appleStore.eatApple();
                System.out.println("남은 사과의 수 = " + appleStore.getStoredApple());
            }
        };

        // 3개의 thread를(멀티쓰레드) 한꺼번에 만들어서 start를 해버림!
        // 생성(NEW)과 동시에 start(NEW -> RUNNABLE)
        for (int i = 0; i < 3; i++) {
            // thread A, B, C
            new Thread(task).start();
        }
    }
}

class AppleStore {
    private int storedApple = 10; // 10개로 초기화
    public int getStoredApple() {
        return storedApple;
    }

    public void eatApple() {
        // 아래 스레드가 진행될 동안 다른 스레드들이 들어오질 못함.
        synchronized (this) {

            if (storedApple > 0) {
                try {
                    Thread.sleep(1000); // 3개의 스레드들이 다 1초 기다렸다가
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                storedApple -= 1; // 하나 먹어   // 만약 A,B,C 쓰레드 중 B 스레드가 사과를 먼저 먹었다고 하면 사과가 1개 남았을 때 더이상 먹을 사과가 없지만,
                // 스레드 A, C도 이미 이 로직으로 들어왔기 때문에 "storedApple -= 1;" 이 로직을 수행할 수 밖에 없다.
                // 없는 사과를 또 먹게 된다.
                // 이 스레드 영역을 모두 들어올 수 있기 때문이다.
            }
        }
    }
}