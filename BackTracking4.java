public class BackTracking4 {

    public static int gridWays(int i, int j, int n, int m){

        //base case 

        if(i==n-1 || j == m-1){
            // condition for last cell
            return 1;
        }
        else if(i==n || j==n){
            return 0; //boundary cross conditions
        }
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1+w2;

    }
    public static void main(String[] args) {
        int n= 3, m=3;
        System.out.println(gridWays(0, 0, n, m));
    }
    
}
