package task.task3_Calculator;


public class DivideOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber){
        return (double)firstNumber / (double)secondNumber;

    }
}
