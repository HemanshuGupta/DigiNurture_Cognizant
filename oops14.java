public class oops14 {
    public static void main(String[] args) {
        int num = 121, num1 = 121, reversed = 0;
        while(num !=0) {
            int digit = num%10;
            reversed = reversed*10 + digit;
            num/=10;
        }
        if(num1==reversed)
        {
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
