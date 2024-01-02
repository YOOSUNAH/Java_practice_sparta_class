package task;

import java.util.Scanner;
/*
*요리 레시피 메모장 만들기
입력값
내가 좋아하는 요리 제목을 먼저 입력합니다.
요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해주세요. (ex. 3.5)
이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장을 입력합니다.
출력값
입력이 종료되면 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
이어서, 요리 별점을 소수점을 제외한 정수로만 출력해줍니다. (ex. 3)
바로 뒤에 정수별점을 5점만점 퍼센트로 표현했을 때 값을 실수로 출력해줍니다. (ex. 60.0%)
이어서, 입력한 모든 문장 앞에 번호를 붙여서 모두 출력 해줍니다.
*/
public class task1_Recipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dishTitle = sc.nextLine();
        float rate =  Float.parseFloat(sc.nextLine());
        // float rate2 = sc.nextFloat();  이렇게 하면 뒤에 순서가 다 밀린다!
        String process1 = sc.nextLine();
        String process2 = sc.nextLine();
        String process3 = sc.nextLine();
        String process4 = sc.nextLine();
        String process5 = sc.nextLine();
        String process6 = sc.nextLine();
        String process7 = sc.nextLine();
        String process8 = sc.nextLine();
        String process9 = sc.nextLine();
        String process10 = sc.nextLine();

        System.out.println("[" + dishTitle + "]");
        int intRate = (int)rate;
        System.out.print("별점 : "  + intRate);
        double percentage = intRate * 100 / 5.0;
        System.out.println("(" + percentage + "%)");
        System.out.println("1." + process1);
        System.out.println("2." + process2);
        System.out.println("3." + process3);
        System.out.println("4." + process4);
        System.out.println("5." + process5);
        System.out.println("6." + process6);
        System.out.println("7." + process7);
        System.out.println("8." + process8);
        System.out.println("9." + process9);
        System.out.println("10." + process10);

    }
}