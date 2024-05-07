public class OOPS3 {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
        h.eat();
        
    }
    
} 

abstract class Animal{
    String color;
    
    Animal()  {
        
    }
    void eat(){
        System.out.println("hi"); 
    }

    abstract void walk();
    
}

class Horse extends Animal{
    void changeColor(){
        color ="dark brown";
    }
    void walk(){
        System.out.println("walks on four legs");
    }

}

class Chicken extends Animal{
    void changeColor(){
        color ="yellow";
    }
    void walk(){
        System.out.println("walks on two legs");
    }
}
