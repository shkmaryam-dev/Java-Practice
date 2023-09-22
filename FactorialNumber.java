// Factorial Calculation:
// Implement a program to calculate the factorial of a given number using a for loop.

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Factorial Number: ");
        int factNumber = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= factNumber; i++) {
            num *= i;
        }
        System.out.println(num);
        sc.close();
    }
}
