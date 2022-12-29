
// very important questions microsoft ask this is placement round  2023



import java.util.Scanner;


public class sprialorder {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



    static void printSprialOrder(int[][] matrix, int r, int c) {
        int topRow = 0, bottomRow =r-1, leftcol =0, rightcol =c-1;
        int totalElements =0;


        while(totalElements  < r*c){
            // top row -> leftcol to rightcol

            for(int j = leftcol; j <= rightcol && totalElements < r*c; j++){
                System.out.print(matrix[topRow][j] + " ");
                totalElements ++;

              


            }
            topRow++;


            // riht col -> top row to bottomRow

            for(int i = topRow; i <= bottomRow && totalElements < r*c; i++){
                System.out.print(matrix[i][rightcol] + " ");
                totalElements ++;
                

            }
            rightcol--;


            // bottomRow -> rihtcol to leftcol

            for(int j = rightcol; j >= leftcol && totalElements < r*c; j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements ++;
                


            }
            bottomRow--;


            // letcol -> bottomRow to top row\

            for(int i = bottomRow; i>=topRow && totalElements < r*c; i--){
                System.out.print(matrix[i][leftcol] + " ");
                totalElements ++;
              


            }
            leftcol++;
        }


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
        System.out.println("Input Matrix");
        printMatrix(matrix);
        System.out.println("Sprial Order");
        printSprialOrder(matrix, r, c);
    }
}



