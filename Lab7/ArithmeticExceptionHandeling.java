package Lab7;
import java.util.Scanner;

public class ArithmeticExceptionHandeling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first operand: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second operand: ");
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed, regardless of exceptions.");
        }
    }
}

