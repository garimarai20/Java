public class DivideandConquer {
public static void PrintArr(int arr[]){
    for(int i =0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

public static void MergeSort(int arr[], int si,int ei){
    //base case

}



    public static void main(String[] args) {
        int arr[]= {6,3,9,5,2,8};
        MergeSort(arr, 0, arr.length -1);

        PrintArr(arr);

    }

}
