package Lab7;

import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hrs;
    private int min;
    private int sec;

    public void takeTimeFromUser() throws HrsException, MinException, SecException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        hrs = sc.nextInt();
        if (hrs < 0 || hrs > 24) {
            throw new HrsException("hour is not within range (0-24)");
        }

        System.out.print("Enter minutes: ");
        min = sc.nextInt();
        if (min < 0 || min > 60) {
            throw new MinException("minute is not within range (0-60)");
        }

        System.out.print("Enter seconds: ");
        sec = sc.nextInt();
        if (sec < 0 || sec > 60) {
            throw new SecException("second is not within range (0-60)");
        }
    }

    public String toString() {
        return String.format("Correct Time -> %d:%d:%d", hrs, min, sec);
    }
}

public class timeexception {
    public static void main(String[] args) {
        try {
            Time time = new Time();
            time.takeTimeFromUser();
            System.out.println(time);
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}
