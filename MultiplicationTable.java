// Multiplication Table:
// Create a program to generate the multiplication table for a given number using a for loop.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number for Multiplication Table: ");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }

    }
}
