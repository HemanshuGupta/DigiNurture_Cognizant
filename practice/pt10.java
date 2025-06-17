package practice;
import java.util.*;
// Abstract class Student
abstract class Student {
    int rollNo;
    String regNo;

    // Constructor
    Student(int rollNo, String regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    // Abstract method course()
    abstract void course();

    // Method getInput()
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        System.out.print("Enter registration number: ");
        regNo = sc.next();
        sc.close();
    }
}

// Subclass Kiitian
class Kiitian extends Student {

    // Constructor
    Kiitian(int rollNo, String regNo) {
        super(rollNo, regNo);
    }

    // Implementation of course() method
    void course() {
        System.out.println("Course: B.Tech from KIIT University");
    }

    // Method to print details
    void printDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Registration Number: " + regNo);
        course();
    }
}

// Driver class
public class pt10 {
    public static void main(String[] args) {
        Kiitian kiitian = new Kiitian(0, "");
        kiitian.getInput();
        kiitian.printDetails();
    }
}