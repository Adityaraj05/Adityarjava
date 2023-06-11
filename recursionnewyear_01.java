
// Given a number num and a value k. Print K multiples of num.ex
// num = 12 , k= 5
// 12,24,36,48,60
import java.util.Scanner;

// public class recursionnewyear_01 {
//     static void printMultiples(int n, int k){
//         // base case 

//         if(k==1){
//             System.out.println(n);
//             return;
//         }

//         // recursive case
//         printMultiples(n, k-1);


//         // self work
//         System.out.println(n*k);
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         printMultiples(n, k);
      
//     }
    
// }




// Given a number n . Find the sum of natural numbers till n but with alternate signs.


// Just for practise process
// public class recursionnewyear_01 {
//     static int SeriesSum(int n){
//         // base case 

//         if(n==0){
//             return 0;
//         }

//         // recursive case
//         return SeriesSum(n-1) + n;

//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(SeriesSum(n));
      
//     }
    
// }



// time complexity:- O(n)
public class recursionnewyear_01 {
    static int SeriesSum(int n){
        // base case 

        if(n==0) return 0;
        

        // recursive case
        if(n%2==0){
        return SeriesSum(n-1) - n;
        }else{
            return SeriesSum(n-1) + n;

        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SeriesSum(n));
      
    }
    
}
    