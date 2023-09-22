// Positive, Negative, or Zero:
// Create a program that takes a number as input and determines whether it's positive, negative, or zero.

import java.util.Scanner;

public class PosNagAndZero {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        sc.close();

        if(number==0){
            System.out.println("Number is Zero");
        }else if(number>0){
            System.out.println("Number is Positive");
        }else if(number < 0 ){
            System.out.println("Number is Nagative");
        }else{
            System.out.println("Nothing");
        }
    }
}
