package Pattern;
// Pattern 9:

// Write a Java program to print the following pattern:
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
// 4 4 4 4
// 3 3 3
// 2 2
// 1

public class Pattern8 {
    public static void main(String[] args) {
        int rows = 5;
        // int num = 1, no=4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                // System.out.print(num + " ");
            }
            // num++;
            System.out.println();

        }

        for (int k = rows-1; k >= 1; k--) {
            for (int j = 1; j <= k; j++) {
                System.out.print(k + " ");
                // System.out.print(no + " ");
            }
            // no--;
            System.out.println();
        }
    }
}
