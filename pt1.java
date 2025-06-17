import java.util.Scanner;
public class pt1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        // Get 5 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }
        // Sort the numbers in ascending order using bubble sort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        // Print the sorted numbers
        System.out.println("Sorted numbers in ascending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
