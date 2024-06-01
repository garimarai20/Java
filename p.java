public class p{

    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }else{

        for(int i =2; i<n;i++){
            if(n%i==0){
                return false;  
            }
            else{
                return true;
            }
        } }return true;
    }

    public static boolean isSquare(int n){
        if((Math.sqrt(n*n)) == n){
            return true;
        }else{return false;}

    }

    public static void main(String[] args) {
        System.out.println(isSquare(6));

        // int a[]= new int[6];
        // int po2 = 1 ;
        // int po3 = 1 ;
        // for(int i=0; i<a.length;i++){
        //     if((isPrime(i+1)) == true){
        //         a[i]= po2;
        //         po2 = po2*2;
        //     }

        // }



    }
}