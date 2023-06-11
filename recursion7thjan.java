// Find the GCD using recursion

// Given two number x and y . Find the greatest common divisor of x and y using recursion.
// import java.util.Scanner;
// public class recursion7thjan {


//     static int gcd(int x, int y) {
//         while ( x % y !=0){
//             int rem = x % y;
//             x = y;
//             y = rem;

//         }
//         return y;


//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         System.out.println(gcd(x,y));
        
//     }
    
// }



// Euclid algorithm 





import java.util.Scanner;
public class recursion7thjan {


    static int gcd(int x, int y) {
        if(y ==0){
            return x;
        }
       return gcd (y, x %y);
        
        


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x,y));
        
    }
    
}
