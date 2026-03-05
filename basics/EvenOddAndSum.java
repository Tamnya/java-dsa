
/*
Concept: Input of n numbers, sum of first n numbers and printing first n numbers. 
Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.*;

public class EvenOddAndSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of positive number n: ");
        int n = sc.nextInt();
        // check n is even or odd
        if (n % 2 == 0) {
            System.out.println("It is even.");
        } else {
            System.out.println("It is an odd number.");
        }
        // sum of first n numbers
        int sum = n * (n + 1) / 2;
        System.out.println("Sum of first n numbers: " + sum);

        // first n numbers printout
        System.out.println("The first n numbers are: ");
        for (int i = 1; i <= n; i++) {

            System.out.print(i + " ");
        }
        sc.close();
    }
}