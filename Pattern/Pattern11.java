package Pattern;
// Pattern 11:

// Write a Java program to print the following pattern:

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

public class Pattern11 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            int startvalue = i % 2 == 0 ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(startvalue + " ");
                startvalue = 1 - startvalue;
            }
            System.out.println();
        }
    }
}
