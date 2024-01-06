package task.task3_Calculator;



public class Calculator {

    private AbstractOperation operation;  // 내부 변수로 만들어주기.

    public Calculator(AbstractOperation operation) {  // 생성자
        this.operation = operation;
    }

    // set 만들기,operation을 바꾸기 위해서, 더하기, 나누기, 곱하기, 빼기로 변경을 위해서
   public void setOperation(AbstractOperation operation){
      this.operation = operation;
   }

    public double calculate(int firstNumber, int secondNumber) {
        double answer = 0;
        answer = operation.operate(firstNumber, secondNumber);
        return answer;
    }
}
