package Lab7;
import java.io.*;
import java.util.*;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of numbers : ");
        String a = sc.nextLine();
        String[] num = a.split(" ");
        int[] arr = new int[5];
        try{
            int i;
            for(i=0;i<num.length;i++){
                arr[i]=Integer.parseInt(num[i]);
            }
        }catch(NumberFormatException e){
            System.out.println("Exception : "+e);
        }
    }
}1
