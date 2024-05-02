public class BitManipulation {
    public static void oddOrEven(int n){
        int bitmask=1;
        if((n&1) == 0){
            System.out.println("even number");
        } else{
             System.out.println("odd number");
        }

    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(14);
        // System.out.println(5&6);
        // System.out.println(5^6);
        // System.out.println(5|6);
        // System.out.println(~5);
        // System.out.println(5<<2);
    }
    
}
