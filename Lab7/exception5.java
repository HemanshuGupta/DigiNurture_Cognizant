package Lab7;
import java.util.stream.IntStream;

public class exception5 {

    public static void main(String[] args) throws CheckArgument {
        if (args.length < 4) {
            throw new CheckArgument("Please provide at least four arguments.");
        }

        int sumOfSquares = IntStream.of(args)
                .mapToInt(Integer::parseInt) 
                .map(x -> x * x) 
                .sum(); 
        System.out.println("Sum of squares: " + sumOfSquares);
    }
}

class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

