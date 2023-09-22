// Fibonacci Series:
// Write a program to generate the Fibonacci series up to a certain number of terms using a for loop.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        scanner.close();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series up to " + terms + " terms:");
        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 3; i <= terms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
