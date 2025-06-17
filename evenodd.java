import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=0;i<10;i++){
            System.out.println("Enter a number : ");
            arr[i]=sc.nextInt();
        }
        int e=0,o=0;
        for(i=0;i<10;i++){
            if(arr[i]%2==0){
                e=e+1;
            }
            else
                o=o+1;
        }
        System.out.println("EVEN : "+e);
        System.out.println("ODD : "+o);
    }
}
