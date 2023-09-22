import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        String str = sc.nextLine();
        String nstr = "";
        char ch;
        sc.close();

        // using loop
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reverse String is : " + nstr);

        // using StringBuilder
        StringBuilder revStr = new StringBuilder();
        revStr.append(str);
        revStr.reverse();
        System.out.println("Using String Builder :" + revStr);
    }
}
