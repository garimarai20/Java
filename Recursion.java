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

    public static int Pow(int n , int x){
        if(n == 0){
            return 1;
        }
        int f = x * Pow(n-1, x);
        return f;
    }

    public static int OpPow(int a, int n ){
        
        if(n == 0){
            return 1;
        }
        int z= OpPow(a, n/2);
        int halfPow = z* z;
        if(n%2 != 0){
            halfPow = a * halfPow;
        }
        return halfPow;
    }

    public static int TilingProblem(int n){ //2 x n (floor size)
        if(n == 0 || n ==1){
            return  1;
        }
        //vertical choice
        int VerticalTiles = TilingProblem(n-1); // f(n -1)

        //horizontal choice 
        int HorizontalTiles = TilingProblem(n-2); // f(n-2)

        int totalways = VerticalTiles + HorizontalTiles;
        return totalways;
    }

    public static void RemoveDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
       if(idx== str.length()){
        System.out.println(newStr);
        return;
       }

       //kaam 
       char currChar = str.charAt(idx);
       if(map[currChar- 'a']== true){
        //duplicate
        RemoveDuplicate(str, idx+1, newStr, map);
       }else{
        map[currChar - 'a'] = true;
        RemoveDuplicate(str, idx+1, newStr.append(currChar), map);
       }

    }
    

    public static void main(String[] args) {

        String str = "appnnaacollege";
        RemoveDuplicate(str, 0, new StringBuilder(""), new boolean[26]);



        // System.out.println(TilingProblem(3));

        // int a = 2;
        // int n =10;
        // System.out.println(OpPow(a, n));

        // int x= 2;
        // int n =0;
        // System.out.println(Pow(n, x));

        // int[] n = {1,2,3,4,5,1,3};
        // int i =0;
        // int key = 3;
        // System.out.println(LastOccur(n, key, i));
    
    }
}
