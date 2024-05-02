import java.util.*;
public class Arrays { 

    public static void reverseArray(int numbers[]){
        int first =0, last= numbers.length-1;

        while(first < last){
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last --;
        }

    }

    public static int binarySearch(int numbers[], int key){
        int start= 0;
        int end = numbers.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid+1;
            } else{
                end= mid-1;
            }
        }  
        return -1;
    }

    public static int LinearSearch(int numbers[],int key){
        for(int i=0; i<numbers.length;i++ ){
            if(numbers[i]==key){
                return(i);
            }
        }
        return -1;
    }
    public static int getLargest(int[] numbers){
        int largest= Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for( int i =0; i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value :"+ smallest);
        return largest;
    }

    public static void printPairs(int numbers[]){
        for(int i= 0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j =i+1;j<numbers.length; j++ ){
                System.out.print(" ("+ curr+" ,"+ numbers[j]+")");
            } System.out.println(" ");
        }    

    }

    public static void subArrays(int numbers[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];
        for(int i = 1; i<=prefix.length;i++){
            prefix[i]=prefix[i-1]+ numbers[i];
        }



        for( int i =0; i < numbers.length; i++){
            int start= i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                sum= start==0? prefix[end]: prefix[end]-prefix[start-1];
                if(max<sum){
                    max= sum;
                    System.out.println(max);
                }
            }System.out.println("");
        } System.out.println("Maximum Subarray Sum="+ max);
    }
    public static void maxSubK(int numbers[]){
        int currSum=0;
        int maxSum= Integer.MIN_VALUE;
        for(int i= 0; i<numbers.length; i++){
            
            currSum+= numbers[i];
            if( currSum<0){
            currSum=0;}
            maxSum=Math.max(currSum,maxSum);
            
        }
        
        System.out.println("Maximum Subarray Sum= "+maxSum);


    }
    public static void main (String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3} ;
        maxSubK(numbers);

        


    }
        










      /*   Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt(); // phys
        marks[1]=sc.nextInt(); // chem
        marks[2]=sc.nextInt(); // maths

        System.out.println("Physics = "+ marks[0]);
        System.out.println("Chemistry = "+ marks[1]);
        System.out.println("Maths = "+ marks[2]);
        marks[2]= 100;
        System.out.println("Maths = "+ marks[2]);*/
    
}
