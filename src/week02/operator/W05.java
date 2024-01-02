package week02.operator;

public class W05 {
    // 대입 연산자
    // 대입 연산자 : =, ++, --
    public static void main(String[] args) {
        // 변수를 바로 연산해서 그 자리에서 저장하는(대입하는) 연산자
        // = (기본 연산자), +=, -=, *= ....(복합대입연산자)
        // ++ : += 1
        // -- : -= 1

        int number = 10;
        number = number + 2;
        System.out.println(number); // 12

        number = number - 2;
        System.out.println(number); // 10

        number = number * 2;
        System.out.println(number); // 20

        number = number / 2;
        System.out.println(number); // 10

        number = number % 2;
        System.out.println(number); // 0

        System.out.println("------------");

        // 복합 대입 연산자
        number = 10;

        number += 2;  // number = number + 2; 를 줄여서 표현한 것
        System.out.println(number);  //12

        number -= 2;  // number = number - 2;
        System.out.println(number);  //10

        number *= 2;  // number = number * 2;
        System.out.println(number);  //20

        number /= 2;  // number = number / 2;
        System.out.println(number);  // 10

        number %= 2;  // number = number % 2;
        System.out.println(number);  // 0

        System.out.println("------------");

        // ++, --
        number = number + 1; // 이걸 줄여서 표현한 것이 아래
        number += 1; // 이걸 줄여서 표현한 것이 아래
        number++;
        System.out.println(number);  // 3

        number--;
        System.out.println(number); // 2

    }
}
