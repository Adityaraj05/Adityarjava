package package2;

import java.util.*;
import package1.Product;

public class product1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String C = sc.nextLine();
        int q  = sc.nextInt();
        float pr = sc.nextFloat();
        Product P = new Product();
        P.setData(N, C,q,pr);
        P.getData();
    }
}
return sum;
 





    static void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // traverse horizontally to calculate rowise prefix sum

        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
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


return sum;
}

