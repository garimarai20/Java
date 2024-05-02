import java.util.Scanner;

public class practice {
    public static boolean isPalindrome(int x) {
        int a=0;
        for(int i=0; i<x;i++){
             a=x%10;
            x= x/10;
        } 
        if(a==x){
        return true;
        }else { return false;}
        
    }
    public static void main(String[] args) {
        int x= 121;
       System.out.println (isPalindrome(x));
    
}}
