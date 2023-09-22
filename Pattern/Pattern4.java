package Pattern;
// Pattern 5:

// Write a Java program to print the following pattern:
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

public class Pattern4 {
    public static void main(String[] args) {
        int row=5;
        int num=1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                // System.out.print(i + " "); //method 1
                System.out.print(num + " "  ); //methos 2 using creating a variable
            }
            num++;
            System.out.println();
        }
    }
}
