// Given an integer, find out the sum of its digits using equation recursion. 

// time complexity: no. of recursive calls * timetaken in call. O(n) n - no. of digits. and time taken in 1 call is 1.
// space complexity will be  O(N) AND N is no of digits.
// public class recursion_26 {
//     static int sod(int n ){
        // base case
        // if(n>= 0&& n<= 9){
        //     return n;
        // }

        // recursive woek ==> small ans 
        // int smallAns = sod(n/10);  //method call therefore new stack frame is generated.

        // self work
        //  return smallAns + n%10;

        //  or 
        


//     }
//     public static void main(String[] args) {
//         System.out.println(sod(1234));
//     }
    
// }






// given two number p & q, find the valule p^q using a recursive function.
// timetaken in call. O(q) 
// space complexity will be  O(q) s.

// public class recursion_26 {
//     static int pow(int p, int q) {
//         // base case
    //    if(q==0) return 1;
       // recursive woek ==> small ans 
    //    return pow(p,q-1)*p;  //p^q-1 = p^q
      

     
//     }
//     public static void main(String[] args) {
//         System.out.println(pow(2,3));
//     }
    
// }  


// best way 
// time complexity =O(log q)
public class recursion_26 {
    static int pow(int p, int q) {
        // base case
        if(q==0) return 1;
        int smallPow=pow(p,q/2);
       if(q%2==0){
        return smallPow * smallPow;  
    }
    return p*smallPow * smallPow;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }
    
}  