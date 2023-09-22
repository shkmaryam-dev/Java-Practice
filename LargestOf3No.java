// Largest of Three Numbers:
// Write a program to find the largest of three given numbers.

import java.util.Scanner;

public class LargestOf3No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of A :");
        int a = sc.nextInt();
        System.out.println("Enter value of B :");
        int b = sc.nextInt();
        System.out.println("Enter value of C :");
        int c = sc.nextInt();

        sc.close();

        if (a > b && a > c) {
            System.out.println("The Largest value of 3 is :" + a);
        } else if (b > a && b > c) {
            System.out.println("The Largest value of 3 is :" + b);
        } else {
            System.out.println("The Largest value of 3 is :" + c);
        }
    }
}
