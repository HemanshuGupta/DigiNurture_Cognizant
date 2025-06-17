package practice;
import java.util.Scanner;

class TwoD {
    double length;
    double width;

    TwoD(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateCost() {
        return length * width * 40; // Cost of 2D sheet: Rs 40 per square ft
    }
}

class ThreeD extends TwoD {
    double height;

    ThreeD(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    double calculateCost() {
        return super.calculateCost() + length * width * height * 60; // Cost of 3D box: Rs 60 per cubic ft
    }
}

public class pt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the plastic (in ft): ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the plastic (in ft): ");
        double width = scanner.nextDouble();

        System.out.print("Is it a 3D box? (yes/no): ");
        boolean is3D = scanner.next().equalsIgnoreCase("yes");

        if (is3D) {
            System.out.print("Enter the height of the plastic (in ft): ");
            double height = scanner.nextDouble();
            ThreeD plastic = new ThreeD(length, width, height);
            System.out.println("Cost of the plastic: Rs " + plastic.calculateCost());
        } else {
            TwoD plastic = new TwoD(length, width);
            System.out.println("Cost of the plastic: Rs " + plastic.calculateCost());
        }

        scanner.close();
    }
}