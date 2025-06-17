import java.util.*;

class Sorting {
    int arr[];
    int i, j, temp;

    Sorting() {
        arr = new int[10];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.println("Enter element for index " + i + " : ");
            arr[i] = sc.nextInt();
        }
    }

    void Sort() {
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10 - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void output() {
        System.out.println("Ascending order : ");
        for (i = 9; i >= 0; i--) {
            System.out.println(" " + arr[i]);
        }
    }
}

public class sort {
    public static void main(String[] args) {
        Sorting s1 = new Sorting();
        s1.input();
        s1.Sort();
        s1.output();
    }
}
