// Recursion: A function calling itself.
// or
// A function calling itself with diferent parameters and a base case to terminate the infinte loop.
// In recursion, we solve a bigger problem by solving smaller subproblems.

// important steps:-
// 1. Identify the smaller problem : let recursion solve it 
// 2. Self work : Do you work
// 3. Identify the base case: Smaller problem for which the answer is obvious.
// note**
// identify recursive work and self work which will excute first




// Write  a pragrom to print all natural numbers from 1 to n using recursion.
import java.util.Scanner;
public class recursion_1 {

    static void printIncreasing(int n ){
        // Base case
        if(n == 1) {
        System.out.println(1);
        return;
    }
         printIncreasing(n-1);
         System.out.println(n);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//smaller sub problem.
        printIncreasing(n); //self work

        }
 }
    

 