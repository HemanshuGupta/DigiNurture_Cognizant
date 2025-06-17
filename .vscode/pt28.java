import java.util.*;

public class pt28 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        System.out.println("Enter 5 numbers : ");
        int i;
        for(i=0;i<4;i++){
            Scanner sc = new Scanner(System.in);{
                arr1[i] = sc.nextInt();
            }
        }
        for(i=0;i<4;i++){
            System.out.print("The five numbers are:"+ arr1[i]);
        }
    }
}
