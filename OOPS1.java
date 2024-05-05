public class OOPS1 {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs =4;
        dobby.breed= "German Shepherd";

        System.out.println(dobby.legs);
        System.out.println(dobby.breed);



        // Fish shark = new Fish();
        // shark.eat();
        // shark.breathe();

    }
    
}

//BASE CLASS
class Animal{
    String color;

    void eat(){ 
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }

}

class Mammal extends Animal{
    int legs;

    void walk(){
        System.out.println("walks");
    }
}

class Bird{
    void fly(){
        System.out.println("fly");
    }
}

class Fish extends Animal{
        int fins;
    
      void swim(){
            System.out.println("swims in water  ");
         }}

class Dog extends Mammal{
    String breed;
}


// SUB-CLASS OR CHILD/DERIVED CLASS
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swims in water  ");
//     }

// }
