

public class OOPS {
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

    BankAccount myAcc = new BankAccount();
    myAcc.username= "GarimaRai";
    myAcc.setPassword("abcdefghi");

    
    }
    
}



class BankAccount{
   public String username;
   private String password;
   
   public void setPassword (String pwd){
    password=pwd;
   }
}
class Pen{
    // Properties
   private  String color;
    private int tip;

    // Functions
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip= newTip;
    } 
    


}

class Student{
    String name ;
    int age;
    float percentage; //cgpa

    void calPercentage(int phy , int maths , int chem){
        percentage = (phy+chem+maths)/3;
    }
}
