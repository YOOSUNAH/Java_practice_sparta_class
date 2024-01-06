package task.task4_calculator_Exception;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws Exception{
        // 정규식 체크
        if(!Pattern.matches(NUMBER_REG, firstInput)){
            throw new BadInputException("정수값");
        }
        // 구현 1.
        this.calculator.setFirstNumber(Integer.parseInt(firstInput));

        return this; // this가 Parser를 의미

    }

    public Parser parseSecondNum(String secondInput) throws Exception{
        // 정규식 체크
        if(!Pattern.matches(NUMBER_REG, secondInput)){
            throw new BadInputException("정수값");
        }
        // 구현 1.
        this.calculator.setSecondNumber(Integer.parseInt(secondInput));

        return this; // this가 Parser를 의미
    }

    public Parser parseOperator(String operationInput) throws Exception{

        // 정규식 체크
        if (!Pattern.matches(OPERATION_REG, operationInput)){
            throw new BadInputException("사칙 연산의 연산자");
        }
        // 구현 1.
        switch (operationInput){
            case "+":
                this.calculator.setOperation(new AddOperation());
                break;
            case "-" :
                this.calculator.setOperation(new SubstractOperation());
                break;
                case "*" :
                    this.calculator.setOperation(new MultiplyOperation());
                    break;
            case "/" :
                this.calculator.setOperation(new DivideOperation());
                break;
        }
        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
