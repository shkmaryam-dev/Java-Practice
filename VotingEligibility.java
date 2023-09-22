// Voting Eligibility:
// Implement a program that takes a person's age as input and determines whether they are eligible to vote (18 years or older).

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age to check wheter they are eligible for vote or not: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not Eligible for vote");
        }
        sc.close();
    }
}
