public class Recursion {
    public static void printDec(int n ){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n +" ");
        printDec(n-1);
    }
    public static void printAsc(int n ){
        if(n ==1){
            System.out.print(n);
            return;
        } 
        printAsc(n-1);
        System.out.print(" "+n+ " ");
    }

    public static int factorial(int n ){
        if(n==0){
            return 1;
        } 
       int  f= n*factorial(n-1);
        return f;

    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println(factorial(n));
    }
}
