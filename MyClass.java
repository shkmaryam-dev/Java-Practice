class MyClass {
    int value;
    
    MyClass(int value) {
        this.value = value;
    }


public static void modifyObject(MyClass obj) {
    obj.value = obj.value + 1;
}

public static void main(String[] args) {
    MyClass myObj = new MyClass(5);
    modifyObject(myObj);
    System.out.println(myObj.value); // This will print 6
}
}
