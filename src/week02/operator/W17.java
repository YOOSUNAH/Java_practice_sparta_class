package week02.operator;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        // 압력받는 단을 제외하고 출력!!
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt();


        // 구구단
        for (int i = 2; i <= 9; i++) { // 구구단의 첫번째 수
            if(i == passNum){
                continue;  // 입력한 값의 구구단은 제외하고 나오게 함.
            }
            for (int j = 2; j <= 9; j++) { // 구구단의 두번째 수
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println("------");
        }

        // 구구단 (특정한 구구단만 출력)
//        for (int i = 2; i <= 9; i++) { // 구구단의 첫번째 수
//            if(i != passNum){
//                continue;  // 입력한 값의 구구단만 나오게 함.
//            }
//            for (int j = 2; j <= 9; j++) { // 구구단의 두번째 수
//                System.out.println(i + " * " + j + " = " + (i*j));
//            }
//            System.out.println("------");
//        }


    }
}
