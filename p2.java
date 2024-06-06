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
            return true;
        }else{
            return false;
        }

    } 

    public static void reverseString(char[] s) {
        //base case
        if()
    }
    public static void main(String[] args) {

        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        // int x =121;
        // System.out.println(isPalindrome(x));
    }
}
