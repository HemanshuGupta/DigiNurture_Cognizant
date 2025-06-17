package practice;
import java.util.*;

class TwoD {
    protected double length;
    protected double breadth;

    public TwoD(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double cost() {
        double area = length * breadth;
        return area * 40;
    }
}

class ThreeD extends TwoD {
    protected double height;

    public ThreeD(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double cost() {
        double vol = length * breadth * height;
        return 60 * vol;
    }
}

public class pt9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of plastic : ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of plastic : ");
        double breadth = sc.nextDouble();
        System.out.println("Enter the height of plastic(for 3D) : ");
        double height = sc.nextDouble();

        TwoD twod = new TwoD(0,0);
        ThreeD threed = new ThreeD(0,0,0);

        System.out.println("Cost of plastic for sheet : " + twod.cost());
        System.out.println("Cost of plastic for box : " + threed.cost());
        sc.close();
    }
}
