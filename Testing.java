public class Testing {
    int value;
    Testing(int val){
        this.value =val;
    }

public static void modifyValue(Testing test){
    test.value = test.value + 5;
}
            
public static void add(int x){
    // Pass By Value but in primitive dataTypes
    x=10;
    System.out.println(x);
}

    public static void main(String[] args) {
     int x = 25;
     add(x);
     System.out.println(x);

     Testing test = new Testing(5);
     modifyValue(test);
     System.out.println("Object " + test.value);
    }
}
