public class OOPS3 {
    public static void main(String[] args) {
        Mustang myhorse = new Mustang();
        
        
        
    }
    
} 

abstract class An{
    String color;
    
    An()  {
        System.out.println("Animal constructor called" );
        
    }
    void eat(){
        System.out.println("helloworld"); 
    }

    abstract void walk();
    
}

class Horse extends An{
    Horse(){
        System.out.println("horse constructor called");
    }
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

class Mustang extends Horse{

    public Mustang() { 
        System.out.println("mustang constructor called");
    }
    
}
