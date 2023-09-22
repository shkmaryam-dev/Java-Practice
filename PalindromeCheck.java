import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number to check it is Plaindrom or not : ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println("Number is Palindrome : " + num);
        } else {
            System.out.println("Number is not a Palindrome Number : " + num);
        }
        sc.close();
    }

    private static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return originalNumber == reversedNumber;
    }

}
