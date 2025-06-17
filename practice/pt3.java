package practice;
import java.util.*;

class TWOD{
    double length;
    double breadth;

    TWOD(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double cost(){
        return length*breadth*40;
    }
}
class THREED extends TWOD{
    double length;
    double breadth;
    double height;

    THREED(double length,double breadth,double height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    double cost(){
        return length*breadth*height*60;
    }
}
public class pt3 {
    public static void main(String[] args) {
        int length;
        int breadth;
        int height;
            Scanner sc = new Scanner(System.in);
    
                System.out.println("Enter the length : ");
                length=sc.nextInt();
                System.out.println("Enter the breadth : ");
                breadth=sc.nextInt();
                System.out.println("Enter the height : ");
                height=sc.nextInt();
        TWOD p1 = new TWOD(length, breadth);
        System.out.println("Cost of the sheet : "+ p1.TWOD());
        THREED p2 = new THREED(length, breadth, height);
        System.out.println("Cost of the sheet : "+ p2.THREED());
    }
}
