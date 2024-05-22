public class DivideandConquer {
public static void PrintArr(int arr[]){
    for(int i =0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

public static void MergeSort(int arr[], int si,int ei){
    //base case
    if(si==ei || si>ei){
        return;
    }
    //Kaam
    int mid = si + (ei - si )/2;
    MergeSort(arr, si, mid);
    MergeSort(arr, mid, ei);
    merge(arr, si, mid, ei);

}




    public static void main(String[] args) {
        int arr[]= {6,3,9,5,2,8};
        MergeSort(arr, 0, arr.length -1);

        PrintArr(arr);

    }

}
