// Character Type Check:
//Create a program that takes a character input and determines whether it's an uppercase letter, lowercase letter, digit, or special character.

import java.util.Scanner;

public class CharTypeChk {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a uppercase letter, lowercase letter, digit, or special character: ");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is a UpperCase Character");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is an LoweCase Character");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit");
        } else {
            System.out.println(ch + " is a Special Character");
        }

        sc.close();
    }
}
