public class javaBasics {
    public static void palindrome(int n) {
        int num = n;
        int rev = 0;
        int originalNum = n; 
        
        while (n > 0) {
            int remainder = n % 10;
            rev = rev * 10 + remainder;
            n = n / 10;
        }
        
        if (rev == originalNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
    
    public static void main(String[] args) {
        palindrome(121);
    }
}
