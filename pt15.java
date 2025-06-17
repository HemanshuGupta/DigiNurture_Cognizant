import java.util.*;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class A {
    public static void ProcessInput() throws NegativeNumberException {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close(); 
        if (num < 0) {
            throw new NegativeNumberException("Negative Number Exception!!!");
        } else {
            System.out.println(num * 2);
        }
    }
}

public class pt15 {
    public static void main(String[] args) {
        try {
            A.ProcessInput();
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
