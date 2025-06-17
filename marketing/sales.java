package marketing;
import java.util.*;
import general.employee;

public class sales extends employee {
    double basic;
    public double tallowance(){
        return (0.05*earnings(basic));
    }
    public static void main(String[] args) {
        sales a = new sales();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID : ");
        a.empid = sc.nextInt();
        System.out.println("Enter basic salary : ");
        a.basic = sc.nextInt();
        sc.close();
        System.out.println("EMPLOYEE ID : "+a.empid);
        System.out.println("TOTAL SALARY : "+a.earnings(a.basic));
        System.out.println("TRAVEL ALLOWANCE : "+a.tallowance());

    }
}
