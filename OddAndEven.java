// Odd or Even:
// Write a program that takes an integer input from the user and prints whether it's odd or even.

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ask ="";
        int a;
        do{
            System.out.println("Enter the Number");
            a = sc.nextInt();
            if (a % 2 != 0) {
                System.out.println("Number is Odd");
            } else {
                System.out.println("Number is Even");
            }
            System.out.println("If you want to continue? (Y/N)");
            sc.nextLine();
             ask = sc.nextLine();
        }
        while (ask.equalsIgnoreCase("Y")); 
        sc.close();
    }
}
