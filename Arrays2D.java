public class Arrays2D{
public static void printSpiral(int matrix[][]){
    int startRow=0;
    int endRow=matrix.length-1;
    int startCol=0;
    int endCol=matrix[0].length-1;

    while(startRow<=endRow && startCol<=endCol){
        // top boundary 
        for(int j=startCol;j<=endCol;j++){
            System.out.print(matrix[startRow][j]+" ");
        }
        //right boundary
        for(int i=startRow+1;i<=endRow;i++){
            System.out.print(matrix[i][endRow]+" ");
        }
        //bottom boundary
        for(int j= endCol-1;j>=startCol;j--){
            if(startRow==endRow){
                break;
            }
            System.out.print(matrix[startRow][j]+" ");
        }
        //left boundary
        for(int i= endRow-1;i>=startRow; endRow--){
            if(startCol==endCol){
                break;
            }
            System.out.print(matrix[i][endRow]);
        } 
        startCol++;
        startRow++;
        endCol--;
        endRow++;
    } System.out.println();

}


  public static void main(String ars[]){ 
     /*   int matrix[][]= new int[3][3];
        int n=matrix.length;
        int m= matrix[0].length;
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]= sc.nextInt();
            } 
        }
        //output
        for (int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");   
            } 
            System.out.println();*/

            int matrix[][]={{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}
                        };

        printSpiral(matrix);
    }
}