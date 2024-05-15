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
        if(n==0 || n==1){
            return n;
        }
        f= Fibonacci(n-1)+Fibonacci(n-2);
        return f;
    }
    public static boolean isSorted(int[] n, int i){
        if(i == n.length-1){
            return true;
        }
        if(n[i]>n[i+1]){
            return false;
        }
        return isSorted(n, i+1);
       
    }

    public static int firstOccur(int[] n, int key, int i ){
        if(i == n.length){
            return -1;
        }
        if(n[i] == key){
            return i;
        }
        return firstOccur(n, key, i+1);
    }

    public static int LastOccur(int n[],int key, int i){
        // if(i<0){ return -1;}
        // if(n[i]== key){
        //     return i;
        // }
        // return LastOccur(n, key, i-1);

        if(i ==  n.length){
            return -1;
        }
        int f = LastOccur(n, key, i+1);
        if( f == -1 && n[i] == key){
            return i;
        }
        return f;

    }

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,1,3};
        int i =0;
        int key = 3;
        System.out.println(LastOccur(n, key, i));
    
    }
}
