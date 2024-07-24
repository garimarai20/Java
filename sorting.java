public class sorting {
    public static void printarr(int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        } System.out.println();
    }

    public static int selectionSort(int[] arr){
        int n= arr.length;
        
        for(int i=0; i<=n-1;i++){
            int min=i;
            for (int j=0; j<=n-1; j++){
                if(arr[j]< arr[min]){
                    int temp = arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;
                }
                return arr[min];
            }
        } return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,8,7};
        selectionSort(arr);
        printarr(arr);

    }
    
}
