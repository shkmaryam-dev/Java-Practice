import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int reversedNumber = ReversedNumber(num);

        System.out.println("Original Number is :" + num);
        System.out.println("Reversed Number is : " + reversedNumber);
        sc.close();
    }

    private static int ReversedNumber(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
