import java.util.Scanner;

public class AutoGraderInput {
    private static Scanner scanner = new Scanner(System.in);

    // Method to get the first input
    public static double getFirstNumber() {
        return scanner.nextDouble();
    }

    // Method to get the second input
    public static double getSecondNumber() {
        return scanner.nextDouble();
    }
}
