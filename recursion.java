// In a Recursion , we solve a bigger problem by solving its smaller subproblem.


// Find the value of factorial of n 
// Time complexity:O(n)   no.of recursive call * time taken in 1 call.
// space complexity: O(m)
// public class recursion {

//     static int factorial(int n){
//         // base case
//         if(n ==0)return 1;
//         // smaller problem recursive work

//          //factorial(4)=24

//         // big problem recursive work
//         return n * (factorial(n-1));// n* factorail(n-1)
         

//     }
//     public static void main(String[] args) {
//         System.out.println(factorial(4));

        
//     }
    
// }





//2. Program to find the nth fibonacci number
// Time complexity:O(2^n)
// space complexity: O(n)
public class recursion {

    static int fib(int n){
        // base case
        if(n ==0 || n==1)return n;
        
       

        // FInal or self work recursive work
        return (fib(n-1)+ fib(n-2));// n* factorail(n-1)
         

    }
    public static void main(String[] args) {
        for(int i = 0; i <= 10 ; i++){
        System.out.println(fib(i));
        }

        
    }
    
}
   