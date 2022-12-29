// Write  a pragrom to print all natural numbers from n to 1 using recursion.
import java.util.Scanner;
public class recursion2 {

    static void printDcreasing(int n ){
        // Base case
        if(n == 1) {
        System.out.println(1);
        return;
    }
    // self work, recursive work
    System.out.println(n);

    // recursive work:

         printDcreasing(n: n-1);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//smaller sub problem.
        printDcreasing(n); //self work

        }
 }
   