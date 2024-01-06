package task.task4_calculator_Exception;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;

        while(!calculateEnded){
            try{
              calculateEnded = CalculatorApp.start();
            }
            catch(Exception e){
                System.out.println(e.getMessage());

            }
        }
    }
}