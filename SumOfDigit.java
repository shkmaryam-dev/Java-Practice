import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = sc.nextInt(); 
        
        int sum = calculateSumOfDigits(number);
        
        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
    
    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        
        return sum;
    }
}
