public class OOPS3 {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
        h.eat();
        
    }
    
} 

abstract class An{
    String color;
    
    An()  {
        color = "brown";
        
    }
    void eat(){
        System.out.println("helloworld"); 
    }

    abstract void walk();
    
}

class Horse extends An{
    void changeColor(){
        color ="dark brown";
    }
    void walk(){
        System.out.println("walks on four legs");
    }

}

class Chicken extends An{
    void changeColor(){
        color ="yellow";
    }
    void walk(){
        System.out.println("walks on two legs");
    }
}
