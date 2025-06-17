package practice;

import java.util.Scanner;

class box{
    int length;
    int breadth;
    int height;
    void get_values(){
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter length : ");
            length = sc.nextInt();
            System.out.println("Enter breadth : ");
            breadth = sc.nextInt();
            System.out.println("Enter height : ");
            height = sc.nextInt();
        }
    }
    int Volume(){
        return length*breadth*height;
    }
}

public class pt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        box b1 = new box();
        b1.get_values();
        System.out.println("Volume : "+b1.Volume());
    }
}
