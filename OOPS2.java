public class OOPS2 {
    public static void main(String[] args) {
        Deer d = new Deer();
        Animal a = new Animal();
        d.disposes();
        a.disposes();

    //     Calculator calc =new Calculator();
    //    System.out.println( calc.sum(1, 2));
    //    System.out.println( calc.sum((float)1.5,(float) 2.5));
    //     System.out.println(calc.sum(1,2,3));
    }
} 

class Calculator{
   int  sum (int a , int b){
    return a+b;
   } 

   float sum(float a, float b){
    return a+b;
   }
   int sum(int a, int b, int c){
    return a+b+c;
   }
}

class Animal{
    void eat(){
        System.out.println("eats yellow");
    } 

    void disposes(){
        System.out.println("disposes what it eats");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }

}
