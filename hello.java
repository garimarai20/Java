public class hello {
    public static boolean staircaseSearch(int matrix[][],int key){
        int row= 0; int col= matrix.length-1;
        while(row<matrix.length && col >=0){
            if(matrix[row][col]==key){
                System.out.println("Found key at("+row +","+ col +")");
                return true;
            }
            else if (key<matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        } System.out.println("Key not found !");
        return false;
    }
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if (i+j == matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return(sum);
    }
    
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=33;
        staircaseSearch(matrix,key);



      /*   
      int matrix[][]={ {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.print(diagonalSum(matrix));
        int sum1= 1+6+11+16+4+7+10+13;
        System.out.println(sum1);*/

    }
}
    

