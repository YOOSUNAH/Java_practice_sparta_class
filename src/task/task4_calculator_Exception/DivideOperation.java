package task.task4_calculator_Exception;


public class DivideOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber){
        return (double)firstNumber / (double)secondNumber;

    }
}