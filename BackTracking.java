public class BackTracking {

    public static void changeArr(int[] a, int i,int val){
//base case 
        if(i==a.length){

        }


//recursion 
        a[i]=val;
        changeArr(a, i+1, val+1);
        a[i]= a[i]-2; 


    }

    public static void printArr(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }


    public static void main(String[] args) {
        int a[]= new int[5];
        changeArr(a, 0, 1);
        printArr(a);
    }
}
