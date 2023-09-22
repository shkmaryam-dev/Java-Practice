// Time of Day Greeting:
// Write a program that takes the current time in 24-hour format and prints a suitable greeting message based on the time of day (morning, afternoon, evening, night)

import java.util.Scanner;

public class TimesOfDayGrettings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Time in 24 Hour Format : ");
        int time = sc.nextInt();

        if (time >= 0 && time <= 12) {
            System.out.println("Good Morning");
        } else if (time >= 13 && time <= 16) {
            System.out.println("Good Afternoon");
        } else if (time >= 17 && time <= 19) {
            System.out.println("Good Evening");
        } else if (time >= 20 && time <= 24) {
            System.out.println("Good Night");
        }

        sc.close();
    }
}
