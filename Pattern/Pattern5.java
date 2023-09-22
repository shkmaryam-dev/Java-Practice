package Pattern;

// Pattern 6:
// Write a Java program to print the following pattern:
// A
// B B
// C C C
// D D D D
// E E E E E

public class Pattern5 {
    public static void main(String[] args) {

        int rows = 5;
        for (int i = 0; i < rows; i++) {
               // Print spaces
            //    for (int j = 0; j < rows - i - 1; j++) {
            //     System.out.print(" ");
            // }
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        // char a='A';
        // for(char i='A'; i<='E'; i++){
        // for(char j='A'; j<=i; j++){
        // System.out.print(i + " ");
        // // System.out.print(a + " ");
        // }
        // a++;
        // System.out.println();
        // }
    }
}
