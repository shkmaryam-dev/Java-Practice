package OOPs;
class Animal1 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal1 {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Animal{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
    }

}
