package practice;
import java.util.*;

interface salary{
    int basicSalary=10000;
    double earnings();
    double deductions();
    default double bonus(){
        return 0;
    };
}
class manager implements salary{
    double basicSalary;
    public manager(int basicSalary){
        this.basicSalary=basicSalary;
    }
    public double earnings(){
        return (basicSalary + ((4*basicSalary)/5) + ((3*basicSalary)/20));
    }
    public double deductions(){
        return ((3*basicSalary)/25);
    }
}

class substaff extends manager{
    int basicSalary;
    public substaff(int basicSalary){
        super(basicSalary);
    }
    public double bonus(){
        return (basicSalary/2);
    }
}

public class pt11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter basic salary : ");
        int basicSalary = sc.nextInt();
        substaff staff = new substaff(basicSalary);
        System.out.println("Substaff earnings : Rs"+staff.earnings());
        System.out.println("Substaff deductions : Rs"+staff.deductions());
        System.out.println("Substaff bonus : Rs"+staff.bonus());
        sc.close();
    }
}
