
    
    import java.util.Scanner;

    public class matrixrotate {
        static void printMatrix(int[][] matrix) {
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length;j++){
                    System.out.println(matrix[i][j] + " ");
                }
                 System.out.println();
            }
        }
        
    
        static int[][] findTranspose(int[][] matrix, int r, int c) {
            int[][] ans = new int[c][r];
    
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < r; j++) {
                    ans[i][j] = matrix[j][i];
                
    
                }
            } 
    
            return ans;
    
        }
    
        static void transposeInPlace(int[][] matrix, int r, int c){
            for(int i=0; i<c; i++){
                for(int j=i; j<r; j++){
                    // swap matrix[i][j] , matrix[j][i]
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        
        static void reverseArray(int[] arr){
            int i = 0,  j= arr.length-1;
            while(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;

            }


        }
         static void rotate(int[][] matrix, int n){
            // transpose
            // reverse each row of transposed matrix

            transposeInPlace(matrix, n, n);
            // reverse each row of transposed matrix
            for(int i = 0; i < n; i++){
               
                reverseArray(matrix[i]);
            }

         }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of rows and columns of the matrix ");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] matrix = new int[r][c];
            int totalElements = r * c;
            System.out.println("Enter " + totalElements + " values");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
    
                }
            }
            System.out.println("Input Matrix");
            printMatrix(matrix);

            rotate(matrix, r);
            System.out.println("Rotation of matrix");
            printMatrix(matrix);
        }
            
    }
    
