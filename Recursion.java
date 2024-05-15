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
    public static int Sum(int n){
        if(n==0){
            return n;
        }
        int sum=0;
        sum=n + Sum(n-1);
        return sum;
    }
    public static int Fibonacci(int n){
        int f =0;
        if(n==0){
            return 0;
        }
        f= Fibonacci(n-1)+Fibonacci(n-2);
        return f;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(Fibonacci(n));
    }
}
