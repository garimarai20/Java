

public class BitManipulation {
    public static void oddOrEven(int n){
        int bitmask=1;
        if((n&1) == 0){
            System.out.println("even number");
        } else{
             System.out.println("odd number");
        }
    }
 public static int getIthBit(int n,int i ){
    int bitMask =1<<i;
    if((n&bitMask) == 0){
        return 0;
    }else {
        return 1;
    }

 } 
 public static int setIthBit(int n, int i ){
    int bitMask = 1<<i;
    return n|bitMask;
 }
 public static int clearIthBit(int n, int i ){
    int bitMask =~(1<<i);
    return n&bitMask;
 }
public static int updateIthBit(int n ,int i , int newBit){
    // if(newBit == 0) {
    //     return clearIthBit(n, i);
    // } else {
    //     return setIthBit(n, i);
    
    n = clearIthBit(n, i);
    int bitMask = newBit<<i;
    return n|bitMask;

}

public static int clearIBits(int n,int i){
    int bitMask = (~0)<<i;
    return n&bitMask;
}

    public static void main(String[] args) {
       System.out.println( clearIBits(15,2));




        // oddOrEven(3);
        // oddOrEven(11);
        // oddOrEven(14);
        // System.out.println(5&6);
        // System.out.println(5^6);
        // System.out.println(5|6);
        // System.out.println(~5);
        // System.out.println(5<<2);
    }
    
}
