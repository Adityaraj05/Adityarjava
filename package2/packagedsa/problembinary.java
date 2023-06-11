// Find the first occurrence of a given element x, given array is sorted. If no occurrence of x if found then return -1;

// input: [2,5,5,5,6,6,8,9,9]
// x=5
// output : 1


// public class problembinary {
//     static int firstOccurrence(int[] a , int x){
//         int n = a.length;
//         int st = 0, end =n-1;
//         int fo = -1;
//         while(st<=end){
//         int mid = st +(end-st)/2;
//         if(a[mid] == x){
//             fo = mid;
//             end = mid - 1;

//         }else if(x <a[mid]){
//             end = mid -1; 
//         }else{
//                 st = mid + 1;
//             }
//         }
//         return fo;
//     }
//     public static void main(String[] args) {
//         int[] a = {1,5,5,5,56,2,4};
//         int x = 5;
//         System.out.println(firstOccurrence(a,x));
//     }
    
// }



// 2.Find the square root of given non negative value x. Round it off to the nearest floor integer value.

// intput  x: 4
// output =2

public class problembinary {
    static int SquareRoot(int x){
        int st = 0, end = x;
        int ans = -1;
        while(st <= end){
            int mid = st +(end-st)/2;
            int val = mid * mid;
            if(val==x){
                return mid;
            }else if(val< x){
                ans = mid;
                st = mid + 1;
            }else {
                end = mid-1;
            }
        }
        return ans;
        
        
    }
    public static void main(String[] args) {
       
        int x = 24;
        System.out.println( SquareRoot(x));
    }
    
}
