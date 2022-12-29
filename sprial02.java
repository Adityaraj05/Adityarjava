
// given a positive integer n, generate an n*n matrix filled with elements from i to n^2 in sprialorder



import java.util.Scanner;


public class sprial02 {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



    static int[][] generateSprialMatrix(int n) {
        int[][] matrix = new int[n][n];


        int topRow = 0, bottomRow =n-1, leftcol =0, rightcol =n-1;
        int current =1;


        while(current<= n*n){
            // top row -> leftcol to rightcol

            for(int j = leftcol; j <= rightcol && current <= n*n; j++){
                matrix[topRow][j] = current++;
               
               
              

              


            }
            topRow++;


            // riht col -> top row to bottomRow

            for(int i = topRow; i <= bottomRow && current < n*n; i++){
               matrix[i][rightcol] = current ++;
                

            }
            rightcol--;


            // bottomRow -> rihtcol to leftcol

            for(int j = rightcol; j >= leftcol && current < n*n; j--){
                matrix[bottomRow][j]= current ++;
                


            }
            bottomRow--;


            // letcol -> bottomRow to top row\

            for(int i = bottomRow; i>=topRow && current < n*n; i--){
               matrix[i][leftcol] =current ++;
            
              


            }
            leftcol++;
        }
    
        return matrix;
        
    }






    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        int[][] matrix = generateSprialMatrix(n);
        printMatrix(matrix);
    }
    
    
}
      





