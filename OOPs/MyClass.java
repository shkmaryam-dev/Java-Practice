package OOPs;
class Hello implements myInterface{

    @Override
    public void sayHello() {
        System.out.println("Hello World!");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'sayHello'");
    }

    @Override
    public int add(int x, int y) {
        int total = x+y;
        return total;
    }
    
}
public class MyClass{

    public static void main(String[] args) {
        Hello class1 = new Hello();
        class1.sayHello();
       System.out.println(class1.add(15, 25)); 
        
    }
    
}
