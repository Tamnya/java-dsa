
/*
Concept: Input of n numbers, sum of first n numbers and printing first n numbers. 
Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.*;

public class EvenOddAndSum {

    public static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("It is even.");
        } else {
            System.out.println("It is an odd number.");
        }
    }

    public static int calculateSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        checkEvenOdd(n);

        int sum = calculateSum(n);
        System.out.println("Sum of first n numbers: " + sum);

        printNumbers(n);

        sc.close();
    }
}