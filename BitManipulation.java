

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

public static int clearRangebits(int n , int i , int j ){
    int a = ((~0)<<(j+1));
    int b = (1<<i)-1;
    int bitMask = a|b;
    return n&bitMask;

} 
public static boolean isPowerOfTwo(int n ){
    return (n&(n-1))== 0;
}

public static int countSetBits(int n){

    int count= 0;
    while(n>0){
        if((n&1)!=0){ //check LSB
            count ++;
        }
        n= n>>1;

    } return count;
}
public static int fastExpo(int a, int n){
    int ans =1;
    while(n>0){
        if((n&1)!=0){
            ans= ans*a;
        }
        a= a*a;
        n= n>>1;
    } return ans;

}


    public static void main(String[] args) {
       System.out.println( fastExpo(5,3 ));




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
