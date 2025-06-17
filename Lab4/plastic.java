package Lab4;
import java.util.Scanner;
class sheet{
    int l;
    int b;
    void get_dimensions(){
        Scanner sc = new Scanner(System.in);

            System.out.println("SHEET");
            System.out.println("Enter the length : ");
            l=sc.nextInt();
            System.out.println("Enter the breadth : ");
            b=sc.nextInt();
    }
    void cost(){
        int c=40*l*b;
        System.out.println("Cost of sheet : "+c);
    }
}
class box{
    int l;
    int b;
    int h;
    void get_dimensions(){
        Scanner sc = new Scanner(System.in);

            System.out.println("BOX");
            System.out.println("Enter the length : ");
            l=sc.nextInt();
            System.out.println("Enter the breadth : ");
            b=sc.nextInt();
            System.out.println("Enter the height : ");
            h=sc.nextInt();
    }
    void cost(){
        int c=60*l*b*h;
        System.out.println("Cost of box : "+c);
    }
}
public class plastic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sheet s1 = new sheet();
        box b1 = new box();
        s1.get_dimensions();
        s1.cost();
        b1.get_dimensions();
        b1.cost(); 
    }
}
