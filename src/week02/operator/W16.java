package week02.operator;

public class W16 {
    public static void main(String[] args) {
     int number = 0;
//     while(조건){ 조건을 만족하는 동안
//
//     }

        // while ~ 하는 동안
        while(number < 3){ // number < 3 인 동안~~
            number ++;
            System.out.println(number + "출력!");
        }

        System.out.println("----- do ~ while -----");

        // do ~ while
        int number2 = 4;
//        do{
//          이 로직을 먼저 수행하겠다!
//          어떤 작업은 무조건 선행해야 한다 할 때 사용
//        }
//        while();
        do{
            System.out.println(number2 + "출력!");
        }
        while(number2 < 3);

        System.out.println("----- break -----");
        // break (깨부수다)
        // 가장 가까운 블록의 for문 또는 while, swich문을 중단!

        int number3 = 0;
        while(number3 < 3){
            number3++;
            if (number3 == 2){
                break;
            }
            System.out.println(number3+ "출력!!");
        }

        System.out.println("----- break -----");
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            if (i == 2){
                break; // i가 2일때, 가장 바깥 반복문이 종료
            }
            for (int j = 0; j< 10; j++){
                System.out.println("j: " + j);
                if (j == 2){
                    break; // j가 2일때, 안쪽 반복문이 종료
                }
            }
        }

        System.out.println("----- continue -----");
        // continue 계속하다. 그 다음 반복문으로 넘어간다. 밑에 로직은 안타고 다음 반복문으로 넘어간다.
        int number4 = 0;
        while(number4 < 3){
            number4++;
            if(number4 == 2){
                continue;
            }
            System.out.println(number4 + "출력");
        }

    }
}
