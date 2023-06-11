// binary search is only applicable for in sorted array.
// Time complexity= O(logn)
// spce-complexity=O(1)
// public class binary_sort {
//     static boolean binarySearch(int[] a, int target) {
//         int n = a.length;
//         int st = 0, end = n - 1; // 0 based indexing
//         while (st <= end) {
//             int mid = (st + end) / 2;
//             if (target == a[mid]) {
//                 return true;
//             } else if (target < a[mid]) {

//                 end = mid - 1;
//             } else {
//                 st = mid + 1;
//             }

//         }
//         return false;

//     }

//     public static void main(String[] args) {
//         int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//         int target = 0;
//         while(target != 10){

//             System.out.printf("%d exists in arr: %b \n", target, binarySearch(a, target));
//             target++;
//         }

//     }

// }

// 2. binarySearch by recursive implementation. 
// space complexity : O(logn) because of the recursive call stack.

public class binary_sort {

static boolean recBinarySearch(int[] arr, int st, int end, int target){
     
        if (st > end)return false; // base case
        int mid = st + (end-st) / 2; //very important (range of int in java)
        if (target == arr[mid]) {
            return true;
        } else if (target < arr[mid]) {
            return recBinarySearch(arr, st, mid - 1, target); // subproblem

        } else {
            return recBinarySearch(arr, st, mid + 1, target); // return subproblem

        }
    
}

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 0;
        while (target != 11) {

            System.out.printf("%d exists in arr: %b \n", target, recBinarySearch(arr,  0, arr.length-1, target));
           
            target++;
        }

    }
}
