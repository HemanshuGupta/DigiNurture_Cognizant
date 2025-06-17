package Lab4;
import java.util.Scanner;
class charge{
    float e;

    void get_value(){
        Scanner sc= new Scanner(System.in);{
            System.out.println("Enter the units of electricity consumed : ");
            e=sc.nextFloat();
        }
    }
    void cost(){
        float tc,c,t;
        if(e<=50){
            c=e/2;
        }
        else if(e>50 && e<=150){
            c=(e*3)/4;
        }
        else if(e>150 && e<=250){
            c=(e*6)/5;
        }
        else{
            c=(e*3)/2;
        }
        t=c/5;
        tc=c+t;
        System.out.println("Total cost : "+tc);
    }
}
public class electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        charge c1= new charge();
        c1.get_value();
        c1.cost();
    }
}
