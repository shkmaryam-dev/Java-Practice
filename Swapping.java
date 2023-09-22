import java.util.Scanner;

public class Swapping {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer Number : ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Integer Number 2 : ");
        int b = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter a String : ");
        String txt = sc.nextLine();
        System.out.println("Enter another String : ");
        String str = sc.nextLine();
        sc.close();

        System.out.println("Before Swapping 'a' is : " + a);
        System.out.println("Before Swapping 'b' is : " + b);

        System.out.println("Before Swapping 'txt' is : " + txt);
        System.out.println("Before Swapping 'str' is : " + str);

        // swap using 3rd variable
        // String temp = txt;
        // txt = str;
        // str = temp;

        txt = txt+str; //txt = Maryam Shaikh , str = Shaikh
        str = txt.substring(0, (txt.length() - str.length())); // 
        txt = txt.substring(str.length());

        // swap using 2 numbers
        a = a + b; // a=2, b =3 ... a=5
        b = a - b; // a=5 - b=3 ---b=2
        a = a - b; // a=5 - b=2 = a=3

        System.out.println(" ");
        System.out.println("After Swapping 'a': " + a);
        System.out.println("After Swapping 'b' " + b);
        
        System.out.println("After Swapping 'txt' is " + txt);
        System.out.println("After Swapping 'str' is " + str);

    }
}
