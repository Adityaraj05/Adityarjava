//  herer l1 and l2  is row and r1 and r2 is column

import java.util.Scanner;
public class rectablesum2 {


    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum+=matrix[i][j];
            }

        
      
        }
        return sum;
    }

    static void findPrefixSumMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        
        // traverse horizontally to calculate rowise prefix sum

        for(int i = 0; i < r; i++){
            for(int j=1; j <c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }
    static int findSum2(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        findPrefixSumMatrix(matrix);

        for(int i = l1 ; i <= l2 ; i++){
            // r1 to r2 sum for row i 
            if(r1>=1)
            sum += matrix[i][r2]-matrix[i][r1-1];
            else
            sum += matrix[i][r2];

        }
        return sum;
    }

    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total= r*c;
        System.out.println("Enter  " + total + " rows and " + total + " values");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
            matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter rectangle boundaries l1, r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle Sum:  " + findSum(matrix,l1,r1,l2,r2));
        System.out.println("Rectangle Sum :" + findSum2(matrix,l1,r1,l2,r2));
    }
}


// output

// Enter number of rows and columns of matrix
// 3 3
// Enter  9 rows and 9 values
// 1 2 3
// 4 5 6
// 1 1 1
// Enter rectangle boundaries l1, r1, l2, r2
// 1 1 2 2 
// Rectangle Sum13
// Rectangle Sum13