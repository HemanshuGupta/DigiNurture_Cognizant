package practice;

import java.util.Scanner;

class student{
    int roll;
    char name;
    float cgpa;
    int n;
    void get_values(){
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter roll : ");
            roll = sc.nextInt();
            System.out.println("Enter name : ");
            name = sc.next().charAt(1);
            System.out.println("Enter cgpa : ");
            cgpa = sc.nextFloat();
        }
    }
}

public class pt7 {
    
}
