// Number Comparison:
// Write a program that takes two numbers as input and prints whether the first number is greater than, less than, or equal to the second number.

import java.util.Scanner;

public class NoComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of 'A' :");
        int a = sc.nextInt();
        System.out.print("Enter Number of 'B' :");
        int b = sc.nextInt();

        if (a > b) {
            System.out.print("A is greter then B");
        } else if (a < b) {
            System.out.print("A less then B");
        } else if (a == b) {
            System.out.print("A is equal to B");
        }
        sc.close();

    }
}
