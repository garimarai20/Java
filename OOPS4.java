public class OOPS4 {
     
    
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    
    
    
        //     St s1 = new St();
    //    s1.name ="garima";
    //     St s2 = new St();
    //    System.out.println(s2.name);
    //    System.out.println(s1.returnPercentage(20, 50, 50));
        
     }
}
class Anima {
    String color;
    Anima(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Anima{


    Horse(){
        super.color = "brown";

        System.out.println("horse constructor is called");
    }
}



// class St{

//     static int returnPercentage(int math,int phy, int chem){
//         return (math+phy+chem)/3;
//     }
//     static String name;
//     int roll;
    
    

  
// }
