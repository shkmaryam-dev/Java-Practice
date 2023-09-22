package Pattern;

// Pattern 10:
// Write a Java program to print the following pattern:
// * * * * *
//  * * * *
//   * * *
//    * *
//     *

public class Pattern9 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // for (int i = 1; i <= rows; i++) {
        //     // Print spaces
        //     for (int j = 1; j < i; j++) {
        //         System.out.print(" ");
        //     }
            
        //     // Print stars
        //     for (int k = i; k <= rows; k++) {
        //         System.out.print("* ");
        //     }
            
        //     System.out.println(); // Move to the next line
        // }
    }
}
