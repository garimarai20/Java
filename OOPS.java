public class OOPS {
    
}

class Pen{
    // Properties
    String color;
    int tip;

    // Functions
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
