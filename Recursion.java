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

    public static void main(String[] args) {
        int n = 5;
        printAsc(n);
    }
}
