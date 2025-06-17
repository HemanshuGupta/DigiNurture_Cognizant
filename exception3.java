import java.util.Scanner;

class NegativeNumberException extends Exception { 
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class exception3 {

    public static void ProcessInput() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            double doubleValue = number * 2.0;
            System.out.println("Double value: " + doubleValue);
        }
    }

    public static void main(String[] args) {
        try {
            ProcessInput();
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}
