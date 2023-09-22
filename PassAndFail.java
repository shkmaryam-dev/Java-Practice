// Pass or Fail:
// Create a program that takes a student's exam score as input and prints whether the student has passed or failed (passing score is 40).

import java.util.Scanner;

public class PassAndFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Exam Marks:");
        int marks = sc.nextInt();
        sc.close();

        if(marks>=40){
            System.out.println("Student is Passed");
        }else{
            System.out.println("Student is Fail");
        }
    }
}
