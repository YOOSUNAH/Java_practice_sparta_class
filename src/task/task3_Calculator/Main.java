package task.task3_Calculator;


public class Main {

    public static void main(String[] args) {
        // 객체, 인스턴스 만들기
        Calculator calculator = new Calculator(new AddOperation());
        // AbstractOperation 의 상속을 받는 무엇이든지 생성자로 만들 수 있다.
        System.out.println(calculator.calculate(10, 20));

        calculator.setOperation(new SubstractOperation());
        System.out.println(calculator.calculate(10, 3));

        calculator.setOperation(new MultiplyOperation());
        System.out.println(calculator.calculate(2, 3));

        calculator.setOperation(new DivideOperation());
        System.out.println(calculator.calculate(10, 2));



    }
}
