package geometry;
import java.util.*;

public class circle {
    
    double radius;
    public void set_radius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        this.radius = sc.nextDouble();
        sc.close();
    }
    public void get_radius(){
        System.out.println("The radius is : "+radius);
    }
}
