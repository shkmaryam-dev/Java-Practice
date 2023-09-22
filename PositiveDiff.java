// Positive Difference:
// Create a program that takes two integers as input and calculates the absolute difference. If the difference is negative, make it positive before displaying.

import java.util.Scanner;

public class PositiveDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of A : ");
        int a = sc.nextInt();
        System.out.print("Enter Number of B :");
        int b = sc.nextInt();

        int c = Math.abs(a - b); //The java.lang.Math.abs() returns the absolute value of a given argument. 
                                // If the argument is not negative, the argument is returned.
                                // If the argument is negative, the negation of the argument is returned.
        System.out.println(" calculates the absolute difference of a-b : " + c);
        sc.close();
    }
}
