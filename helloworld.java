import java.util.*;

import javax.annotation.processing.SupportedSourceVersion;


public class helloworld {
    public static void printHelloWorld(){
        System.out.println("hello world");
    }
public static int CalSum(int num1,int num2){
    int sum= num1+num2;
    return sum;
}

public static int multiply(int a ,int b ){
    int product = a*b;
    return product;
}
public static int factorial(int n){
    int fact=1;
    for(int i=n; i>=1; i--){
         fact = fact*i;
        
    } return fact;  
}

public static int BinomialCoefficient(int n , int r){
    int fact=factorial(n); 
    int factr=factorial(r); 
    int factnr=factorial(n-r);
   /*  for(int i=n; i>=1; i--){
        fact = fact*i;}
    for(int i=r; i>=1; i--){
        factr = factr*i;}
    for(int i=n-r; i>=1; i--){
        factnr = factnr*i;}
*/
    int BC = fact / (factr * factnr);
    return BC;
}

public static void bintoDec(int binNum){
    int myNum= binNum;
    int pow=0;
    int decNum= 0;
    while(binNum>0){
        int lastNum = binNum%10;
        decNum = decNum + (lastNum *(int)Math.pow(2, pow));
        pow++;
        binNum=binNum/10;
    }
    System.out.println("Decimal of "+myNum + " = " + decNum);
}

public static void DectoBin(int n){
    int MyNum = n ;
    int pow=0;
    int binNum=0;
    
    while(n>0){
        int rem= n%2;
        binNum= binNum+ (rem* (int)Math.pow(10,pow));
        pow++;
        n = n/2;

    } System.out.println("Binary form of "+ MyNum +" = "+ binNum);
}

public static void avg(int a, int b, int c){
    int A = (a+b+c)/3;
    System.out.println(A);
}

public static void isEven(int n){
    boolean even=true;
    if(n%2!=0){
        even= false;
    } 
    System.out.println(even);
}

public static void hollow_rectangle(int totRows,int totCols){
for (int i = 1; i<=totRows; i++){
    for(int j =1; j<=totCols;j++){
        if(i==1 || j==1 || i==totRows || j==totCols){
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    } System.out.println();
}

}

public static void main(String args[]){
       hollow_rectangle(3,4);
    
        }}
// Boiler plate code 
