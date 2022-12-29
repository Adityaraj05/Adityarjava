// Given a matrix a of dimesion n*m and 2 coordinates (l1 r1) and (l2 r2). Return the sum of the rectangle from  (l1 r1) to (l2 r2).
import java.util.Scanner;
public class rectangleSum {


    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum+=matrix[i][j];
        }
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

        System.out.println("Rectangle Sum" + findSum(matrix,l1,r1,l2,r2));
    }
}

    // output

//     Enter number of rows and columns of matrix
// 3 3 
// Enter  9 rows and 9 values
// 1 2 3
// 4 5 6
// 1 1 1
// Enter rectangle boundaries l1, r1, l2, r2
// 0 0 2 2 
// Rectangle Sum24

