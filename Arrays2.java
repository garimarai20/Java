import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Arrays2 {
    public static int trappedRainwater(int height[]){
        int n = height.length;
       // calculate left max boundary - array 
       int leftmax[]= new int[n];
       leftmax[0]=height[0];
       for(int i=1; i<n; i++){
        leftmax[i]=Math.max(height[i], leftmax[i-1]);
       }
       // calculate right max boundary - array
       int rightmax[]= new int[n];
       rightmax[n-1]=height[n-1];
       for(int i=n-2; i>=0; i--){
        rightmax[i]=Math.max(height[i], rightmax[i+1]);
       }
       int trappedWater=0;
       // loop
       for( int i=0; i<n; i++){
        // waterlevel= min(leftmax boundary, rightmax boundary)
      int waterlevel= Math.min(leftmax[i], rightmax[i]);
      // trappedwater= (waterlevel-height[i]) * width of bar 
       trappedWater+= waterlevel- height[i];
       // --> width will only be used if it is given otherwise consider it 1.
       }
       return trappedWater;
    } 
    public static int buyAndsellStocks(int prices[]){
    int buyPrice= Integer.MAX_VALUE;
    int maxProfit=0;

    for(int i = 0; i<prices.length;i++){
        if( buyPrice<prices[i]){
            int profit = prices[i]-buyPrice;//todays's profit
            maxProfit=Math.max(maxProfit, profit);
        }else{
            buyPrice=prices[i];
        }
    } return maxProfit;
    } 

    public static void bubbleSort(int[] x){
        int[] arr={};
        int n =x.length;
        int temp=0;
        for (int i =0; i<n-1 ;i++){
            for(int j=0;j<n-1-i;j++){
            if(x[j]>x[j+1]){
                temp= x[j];
                x[j]=x[j+1];
                x[j+1]=temp;
            } 
        } }
        for( int i =0 ;i<n;i++){
            System.out.print(x[i]+" ");
        } System.out.println();
    } 

    public static void selectionSort(int arr[]){
        for (int i=0;i<arr.length-1; i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArr(int arr[]){
        int n =arr.length;

        for( int i =0 ;i<n;i++){
            System.out.print(arr[i]+" ");
        } System.out.println();
    }

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr=arr[i];
            int prev=i-1;
            // finding out the correct position to insert
            while(prev >=0 && arr[prev]>arr[curr]){
                arr[prev+1] =arr[prev];
                prev--;
            } 
            //insertion
            arr[prev+1]=arr[curr];
        }
    } 

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] =new int[largest+1];
        for(int i=0;i <arr.length;i++){
            count[arr[i]]++; 
        }
        //sorting
        int j=0;
        for(int i=0; i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

}

    public static void main(String[] args){
        int arr[]={1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArr(arr);
        

    }
    
}
