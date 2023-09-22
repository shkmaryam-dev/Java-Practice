package OOPs;

public class OopPractice {

    public static void add(int x){
        x = x+10;
        System.out.println(x);
    }

    public static int add(int x,int y){
        return x+y;
    }

    public static int add(int x,int y, int z){
        return x*y*z;
    }
    public static void main(String[] args) {
        add(10);

        System.out.println(add(10, 20));
        System.out.println(add(10, 20,50));
    }
}

