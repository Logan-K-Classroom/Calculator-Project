import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Gets and stores inputs from the autograder. 
        Scanner graderInput = new Scanner(System.in);

        double firstNumber = graderInput.nextDouble();
        String operation = graderInput.next();
        double secondNumber = graderInput.nextDouble();


        //Default output for result
        double result = 0;

        System.out.print(result);
    }
}