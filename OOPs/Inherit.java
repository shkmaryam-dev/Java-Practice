package OOPs;
class Human{
    int walk;
    Human(int x){
        this.walk = x;
    }

    public  void walking(){
        System.out.println("I am walking daily 25km");
    }
    
}

class Activity extends Human{
    Activity(int w){
        super(w);
        System.out.println(w);
    }
    public  void active(){
        System.out.println("Hii I am active");
    }

    public  void walking(){
        System.out.println("I am not walikng-");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Activity a = new Activity(15);
        a.walking();
        a.active();
    }
}
