public class sorting {
    public void printarr(int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        } System.out.println();
    }

    public static int selectionSort(int[] arr){
        int n= arr.length;
        
        for(int i=0; i<n-1;i++){
            int min=i;
            for (int j=0; j<n; j++){
                if(arr[j]< arr[min]){
                    int temp = arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;

                    return arr[min];
                }
                
            }
        } return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7};
        System.out.print(selectionSort(arr)+" ");

    }
    
}
