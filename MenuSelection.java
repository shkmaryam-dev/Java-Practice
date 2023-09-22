// Menu Selection:
// Create a program for a simple menu that offers options like addition, subtraction, multiplication, and division. Based on the user's choice, perform the corresponding operation on two numbers.

import java.util.Scanner;

public class MenuSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Choice : ");
        String choice = sc.next();

        System.out.print("Enter Value of A : ");
        int a = sc.nextInt();
        System.out.print("Ente value of B : ");
        int b = sc.nextInt();
        int c = 0;

        switch (choice) {
            case "Addition":
                c = a + b;
                System.out.println("Addition of " + a + " and " + b + " is " + " = " + c);
                break;
            case "Subtraction":
                c = a - b;
                System.out.println("Subtraction of " + a + " and " + b + " is " + " = " + c);
                break;
            case "Multiplication":
                c = a * b;
                System.out.println("Multiplication of " + a + " and " + b + " is " + " = " + c);
                break;
            case "Divison":
                if (b != 0) {
                    c = a / b;
                    System.out.println("Divison of " + a + " and " + b + " is " + " = " + c);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
            System.out.println("Invalid Choice");
                break;
        }
        sc.close();
    }
}
