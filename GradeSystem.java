// Grading System:
// Implement a grading system that takes a student's score as input and assigns a grade based on the following criteria:

// 90-100: A
// 80-89: B
// 70-79: C
// 60-69: D
// Below 60: F

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Score:");
        int score = sc.nextInt();

        sc.close();

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
