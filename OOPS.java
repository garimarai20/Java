

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Garima";
        s1.roll=456;
        s1.password ="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;



        
        Student s2 = new Student(s1);
        s2.password= "xyz";
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

        // Student s1 = new Student("Garima");
        // System.out.println(s1.name);



    //     Pen p1= new Pen();
    //     p1.setColor("Yellow");
    //     System.out.println(p1.getColor());
    //     p1.setTip(5);
    //     System.out.println(p1.getTip());

    // BankAccount myAcc = new BankAccount();
    // myAcc.username= "GarimaRai";
    // myAcc.setPassword("abcdefghi");

    
    }
    
}

class Student{
    String name ;
    int roll;
    int[] marks;
    String password;


// copy constructor 
//DEEP COPY CONSTRUCTOR
Student(Student s1){
    marks =new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    for(int i= 0; i<marks.length;i++){
        this.marks[i]= s1.marks[i];
    }

}


// SHALLOW COPY CONSTRUCTOR
    // Student(Student s1){
    //     marks =new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks =s1.marks;

    // }

    public Student() {
        marks =new int[3];
        System.out.println("Constructor is called");
    }

    public Student(String name, int roll, int[] marks, String password) {
        marks =new int[3];
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        this.password = password;
    }
    

   // float percentage; //cgpa

    // Student(){//String name){
    //    System.out.println("Constructor is called");
    //     //this.name = name;
    //     //System.out.
    // }

    // void calPercentage(int phy , int maths , int chem){
    //     percentage = (phy+chem+maths)/3;
    // }
}



// class BankAccount{
//    public String username;
//    private String password;
   
//    public void setPassword (String pwd){
//     password=pwd;
//    }
// }
// class Pen{
//     // Properties
//    private  String color;
//     private int tip;

//     // Functions
//     String getColor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }
//     void setColor(String newColor){
//         color = newColor;
//     }
//     void setTip(int newTip){
//         tip= newTip;
//     } 

// class Student{
//     String name ;
//     int age;
//     float percentage; //cgpa

//     void calPercentage(int phy , int maths , int chem){
//         percentage = (phy+chem+maths)/3;
//     }
// }
    
    


// }

