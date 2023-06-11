// A roated sorted array is a sorted array on which rotation operation has been performed some number of times. Given a rotated array, find the index of the minimum element in the array . follow 0-based indexing.

// it is guaranteed that all the elements in the array are unique.
// input: 
// Array=[3,4,5,1,2]
// output: =3

// public class binaryrotate {
//     static int findMinimum(int[] a) {
//         int n = a.length;
//         int st = 0, end = a.length - 1;
//         int ans = -1;
//         while (st <= end) {
//             int mid = st + (end - st) / 2;
//             if (a[mid] <= a[n - 1]) {
//                 ans = mid;
//                 end = mid - 1;

//             } else {
//                 st = mid + 1;
//             }

//         }
//         return ans;

//     }

//     public static void main(String[] args) {
//         int[] a = { 3, 4, 5, 1, 2 };
//         System.out.println(findMinimum((a)));

//     }

// }

//2.*** Given the rotated sorted array of integers, which contains distinct elements, and an integer target, return the index of target if it is in the array.Otherwise return -1.
// input:=[3,4,5,1,2,], target:=4
// output:1

// public class binaryrotate {
//     static int Search(int[] a, int target) {
//         int st = 0, end = a.length - 1;
       
//         while (st <= end) {
//             int mid = st + (end - st) / 2;
//             if (a[mid] == target) {
//                 return mid;

//             } else if (a[mid] <= a[end]) {
//                 if (target > a[mid] && target <= a[end]) { // mid to end is sorted
//                     st = mid + 1;
//                 } else {
//                     end = mid - 1;
//                 }
//             } else {// st to mid is sorted
//                 if (target >= a[st] && target < a[mid]) {
//                     end = mid - 1;
//                 } else {
//                     st = mid + 1;
//                 }

//             }
//         }
//         return -1;

//     }

//     public static void main(String[] args) {
//         int[] a = { 3, 4, 5, 1, 2 };
//         int target= 4;
//          System.out.println(Search(a, target));

//     }

// }



// 3.Search element in rotated sorted array with duplicated elements. Return true if the element is found else return  false.

// input : [0,0,0,1,1,2,0,0,0], target=2
// output : true 




public class binaryrotate {
    // duplicate elements.
    static int Search_(int[] a, int target) {
        int st = 0, end = a.length - 1;
       
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (a[mid] == target) {
                return mid;

            }
            else if(a[st]==a[mid] && a[end]==a[mid]){
               st++;
               end--;

                }
            else if (a[mid] <= a[end]) {
                if (target > a[mid] && target <= a[end]) { // mid to end is sorted
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {// st to mid is sorted
                if (target >= a[st] && target < a[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }

            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] a = {1,1,1,1,2,3,1};
        int target= 2;
         System.out.println(Search_(a, target));

    }

}





