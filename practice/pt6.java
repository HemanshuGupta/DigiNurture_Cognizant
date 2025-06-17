package practice;

import java.util.Scanner;

class rectangle{
    int length;
    int breadth;
    void read(){
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter length : ");
            length = sc.nextInt();
            System.out.println("Enter breadth : ");
            breadth = sc.nextInt();
        }
    }
    int perimeter(){
        return 2*(length + breadth);
    }
    int area(){
        return length*breadth;
    }
    void display(){
        System.out.println("Perimeter : "+perimeter());
        System.out.println("Area : "+area());
    }
}
public class pt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle r1 = new rectangle();
        r1.read();
        r1.perimeter();
        r1.area();
        r1.display();
    }
}
