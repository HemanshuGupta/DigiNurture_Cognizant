import java.util.Scanner;

class shape {
    int l;
    int b;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        l = sc.nextInt();
        System.out.println("Enter breadth of the rectangle:");
        b = sc.nextInt();
    }
    int perimiter()
    {
        return 2*(l+b);
    }
    int area()
    {
        return l*b;
    }
    void display()
    {
        System.out.println("Perimeter of the rectangle is:" +perimiter());
        System.out.println("Area of the rectangle is:" +area());
    }
}
class rectangle{
    public static void main(String[] args) {
        shape obj1 = new shape();
        obj1.read();
        obj1.display();
    }
}

