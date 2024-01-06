package task.task3_Calculator;


public class MultiplyOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber){
        return (double)firstNumber * (double)secondNumber;

    }
}
