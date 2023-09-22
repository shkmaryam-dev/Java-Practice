// Print Numbers:
// Write a program to print numbers from 1 to 10 using a for loop.

public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number is: " + i);
        }

        System.out.println("=============================");
        System.out.println("=============================");
        // Print Even Numbers:
        // Create a program to print even numbers from 2 to 20 using a for loop.
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even Number is: " + i);
            // using condition
            // if(i%2==0){
            // System.out.println("Even Number is: " + i);
            // }
        }
        System.out.println("=============================");
        System.out.println("=============================");

        // Sum of Natural Numbers:
        // Write a program to calculate the sum of the first 50 natural numbers using a
        // for loop.
        int num = 0;
        for (int i = 1; i <= 50; i++) {
            num  += i;
        }
        System.out.println("Sum of the first 50 natural numbers is: " + num);
    }
}