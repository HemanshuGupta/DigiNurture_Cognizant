package practice;
import java.util.*;


public class pt12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter lower bound: ");
        int lb = sc.nextInt();
        System.out.print("Enter upper bound: ");
        int ub = sc.nextInt();

        CustomArray customArray = new CustomArray(n);
        customArray.random(lb, ub);

        customArray.rearrangesort();
        customArray.displayArray();
    sc.close();
    }
}

class CustomArray {
    int[] arr;
    int size;

    CustomArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    void random(int lb, int ub) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = lb + random.nextInt(ub - lb + 1);
        }
    }

    void rearrangesort() {
        int[] primes = new int[size];
        int[] nonPrimes = new int[size];
        int primeIndex = 0, nonPrimeIndex = 0;

        for (int i = 0; i < size; i++) {
            if (isPrime(arr[i])) {
                primes[primeIndex++] = arr[i];
            } else {
                nonPrimes[nonPrimeIndex++] = arr[i];
            }
        }

        bubbleSort(primes, primeIndex);
        bubbleSort(nonPrimes, nonPrimeIndex);

 
        System.arraycopy(primes, 0, arr, 0, primeIndex);
        System.arraycopy(nonPrimes, 0, arr, primeIndex, nonPrimeIndex);
    }

    private void bubbleSort(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    void displayArray() {
        System.out.println("Updated Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
