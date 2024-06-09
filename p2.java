public class p2 {
    public static boolean isPalindrome(int x){
        int n= x;
        int r ;
        int s=0;
        while(n>0){
        r =n%10;
        s = (s*10)+r;
    n=n/10; }
        if(s == x){
            return (true);
        }else{
            return false;
        }

    } 

    public static void reverseSring(char[] s) {
        int n=0;
        int m=s.length-1;
        //base case
        if(s.length==0 || s.length ==1){
            System.out.println(s[0]);
        }
        while(m >=0){
        char temp = s[n];
        s[n]=s[m];
        s[m] = temp;
        n++;
        m --;
        }
        printArr(s);
    }
    public static void printArr(char[] s){
        for(int i =0; i< s.length ; i++){
            System.out.print(s[i]);
        }
    }
    public static void main(String[] args) {

        char[] s = {'h','e','l','l','o'};
        reverseSring(s);
        
        // int x =121;
        // System.out.println(isPalindrome(x));
    }
}
