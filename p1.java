
public class p1{
    public static boolean isSorted(int[] n, int i,int arr[]){
        if(i == n.length-1){
            return true;
        }
        if(n[i]>n[i+1]){
            return false;
        }
        return isSorted(n, i+1);
       
    }
    public static void main(String[] args) {
        // System.out.println("Enter size of array: ");
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        
        int n[]= {5,4,10,2,1};
        boolean arr[]= new boolean[n.length];
        // System.out.println("Enter elements of array: ");
        // for(int i=0; i<a;i++){
        //     n[i]=sc.nextInt();
        // }
        // System.out.print("Array: " );
        // for(int i=0 ; i<a;i++){
        //     System.out.print(n[i]+" " );
        // }
        for(int i=0;i<n.length;i++){
            for(int j =0; j<n.length;j++){
                if(n[j+1]==i+1){
                    arr[j]=true;
                    
                }else{
                    arr[j]=false;
                 }
                }
            
            if(arr[i]==false){
                System.out.println(i+1);
            }
        }
        }
    }
