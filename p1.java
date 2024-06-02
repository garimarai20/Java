import java.util.Scanner;

public class p1{
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n[]= new int[a];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<a;i++){
            n[i]=sc.nextInt();
        }
        System.out.print("Array: " );
        for(int i=0 ; i<a;i++){
            System.out.print(n[i]+" " );
        }
        for(int i=0;i<a;i++){
            
        }
    }
}