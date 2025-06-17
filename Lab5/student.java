package Lab5;

import java.util.*;

abstract class stud{
    protected Long roll;
    protected long reg_no;
    void get_input(){
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter roll no. : ");
            roll = sc.nextLong();
            System.out.println("Enter registration number : ");
            reg_no = sc.nextLong();
        }
    }
    abstract void course();
}

class kiitian extends stud{

    kiitian(long roll,long reg_no){
        this.roll = roll;
        this.reg_no=reg_no;
    }
    
    void course(){
        System.out.println("Course : B.Tech from KIIT");
    }
    
    void output(){
        System.out.println("Roll No. : "+roll);
        System.out.println("Registration No. : "+reg_no);
        course();
    }
}
public class student {
    public static void main(String[] args) {
        kiitian kiit = new kiitian(0, 0);
        kiit.get_input();
        kiit.output();
    }
}
