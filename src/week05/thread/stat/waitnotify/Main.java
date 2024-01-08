package week05.thread.stat.waitnotify;

import java.util.ArrayList;
import java.util.List;

// wait  : waitingpool 에 들어가서 기다리고, notify에 의해서 나온다.
// notify
public class Main {
    // 1명의 점원과 2명의 고객이 있음
    public static String[] itemList = {
        "MacBook", "IPhone", "AirPods", "iMac", "Mac mini"
    };
    public static AppleStore appleStore = new AppleStore();
    public static final int MAX_ITEM = 5;

    public static void main(String[] args) {

        // 가게 점원
        Runnable StoreClerk = () -> {
            while (true) {
                // 0부터 4사이의 정수 중, Random한 값을 뽑아내기 위함.
                int randomItem = (int) (Math.random() * MAX_ITEM);

                // restock : 재고를 넣는 메서드
                appleStore.restock(itemList[randomItem]);
                try {
                    Thread.sleep(50);  // 0.05 초동안 쉰다.
                } catch (InterruptedException ignored) {
                }
            }
        };

        // 고객
        Runnable Customer = () -> {
            while (true) {
                try {
                    Thread.sleep(77); // 0.77초를 쉬고,
                } catch (InterruptedException ignored) {
                }

                int randomItem = (int) (Math.random() * MAX_ITEM);
                // sale : 판매하는 메서드
                appleStore.sale(itemList[randomItem]); // sale 메서드를 호출
                System.out.println(Thread.currentThread().getName() + " Purchase Item " + itemList[randomItem]);
            }
        };


        new Thread(StoreClerk, "StoreClerk").start();
        new Thread(Customer, "Customer1").start();
        new Thread(Customer, "Customer2").start();

    }
}

class AppleStore {
    private List<String> inventory = new ArrayList<>();

    public void restock(String item) {
        synchronized (this) {
            while (inventory.size() >= Main.MAX_ITEM) {
                System.out.println(Thread.currentThread().getName() + " Waiting!");
                try {
                    // 재고가 꽉 차있어서 재입고하지 않고 기다리는 중!
                    // waiting pool로 들어가서 notify 가 될 때까지 기다린다.
                    wait();

                    Thread.sleep(333);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 재입고
            // 점원이 고객에게 알려주기
            inventory.add(item);
            // 재입고 되었음을 고객에게 알려주기
            notify();

            System.out.println("Inventory 현황: " + inventory.toString());
        }
    }

    public synchronized void sale(String itemName) {
        while (inventory.size() == 0) {  // 재고가 없으면
            System.out.println(Thread.currentThread().getName() + " Waiting 1!");
            try {
                wait(); // 재고가 없기 때문에 고객 대기중
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 재고가 있으면
        while (true) {
            // 고객이 주문한 제품이 있는지 확인
            for (int i = 0; i < inventory.size(); i++) {
                if (itemName.equals(inventory.get(i))) {  // arraylist 상에 있는지 확인
                    inventory.remove(itemName);  // 제품 사는 것이니, 지우고

                    // 고객이 점원에게 알려주기
                    notify(); // 제품 하나 팔렸으니 재입고 하라고 알려주기
                    return; // 메서드 종료  // if 문을 못탔다면, 찾는 것이 배열에 없는 거고, return 문을 못만났으니 아래로!
                }
            }

            // 고객이 찾는 제품이 없을 경우
            try {
                System.out.println(Thread.currentThread().getName() + " Waiting! 2");
                wait();
                Thread.sleep(333); // 0.333초 기다린다.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}