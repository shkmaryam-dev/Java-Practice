package Pattern;
// Pattern 7:

// Write a Java program to print the following pattern:
// *****
// *   *
// *   *
// *   *
// *****

public class Pattern6 {

    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == 1 || i == row || j == 1 || j == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                if (j < row) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
