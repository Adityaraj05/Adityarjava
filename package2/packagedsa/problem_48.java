// Problems based on sorting algorithms.



// 1. Given an array where all its elements are sorted in increasing order except two swapped elements, sort it in linear time. Assume there are no duplicates in the array.
// input A[] = [3,8,6,7,5,9,10]
// output B[] = [3,5,6,7,8,9,10]

// public class problem_48 {
//     static void sortarr(int[] num){
//         int n= num.length;
//         int x = -1 , y = -1;

//         if(n<=1) return; // handling corner cases.


//         // process all adjacent elements
//         for(int i=0; i<n; i++){
//             if(x == -1){ //first conflict
//                 x = i-1;
//                 y =i;

//             }else{  //second conflict
//                 y=i;
                
//             }
//         }
    
//     // swap x, y in num
//     int temp = num[x];
//     num[x] = num[y];
//     num[y] = temp;
//     }
//     static void displayArr(int[] arr){
//         for(int val:arr){
//             System.out.print(val  + " ");

//         }

//     }
//     public static void main(String[] args) {
//         int[] num= {10, 5, 6, 7, 8, 9, 3};
//         sortarr(num);
//         displayArr(num);

//     }
    
// }


// 2. given an array of positive and negative integers, segregate them in linear time and constant space. The output should print all negative numbers, followed by all positive numbers
// intput : [ 19, -20, 7, -4, -13, 11, -5, 3]
// output: [-20 -4, -13, -5, 1, 11 , 19, 3]



// public class problem_48 {



   
//         static void displayArr(int[] num){
//             for(int val:num){
//                 System.out.print(val  + " ");
        
//             }
        
//         }
    
        
//         static void partition(int[] num){
//             int l= 0, r= num.length-1;
//             while(l<r){
//                 while(num[l]<0)l++;
//                 while(num[r]>=0)r--;
//                     if(l<r){
//                        int temp=num[l];
//                        num[l]=num[r];
//                        num[r]=temp;
//                        l++;
//                        r--;

//                     }
//                 }
//         }
//     public static void main(String[] args) {
//         int[] num= {-13, 20, 7, 8, -6, -13, 11, -5, -13};
//         partition(num);
//         displayArr(num);

//     }
    
// }



// 3. given an size N containing only 0s 1s and 2s; sort the array in ascending order.
// Duch National Flag algorithm

// input ; N = 6
// arr[] = {0 2 1 2 0 0 }
// output: 0 0 0 1 2 2 



// Time complexity -->linear time 
// space complexity= constatn space

public class problem_48 {



   
        static void displayArr(int[] num){
            for(int val:num){
                System.out.print(val  + " ");
        
            }
        
        }
        static void swap(int[] a, int x, int y){
            int temp = a[x];
             a[x] = a[y];
             a[y] =temp;
        }
        static void sort012(int[] a){
            int lo =0; 
            int mid =0; 
            int hi =a.length-1;

            // to explore the unknown region
            while(mid<=hi){
                if(a[mid]==0){
                    swap(a, mid, lo);
                    mid++;
                    lo++;
            }else if(a[mid]==1){
                    mid++;
                }else{
                    swap(a, mid, hi);
                    hi--;
                }

            }

        }
        
    public static void main(String[] args) {
        int[] num= {2, 2, 0, 0, 1, 1, 2, 0, 1, 0};
        sort012(num);
        displayArr(num);

    }
    
}
