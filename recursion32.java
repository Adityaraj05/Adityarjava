
// Array recursion 




// public class recursion32 {

//     static void printAray(int[] arr, int idx){
//         // base case 
//         if(idx == arr.length){
//             return;
//         }


//         // self work
//         System.out.println(arr[idx]);

//         // recursive work - sub problem
//         printArray(arr, idx+1);
//     }
//     public static void main(String[] args) {
//         int  [] arr = {5,6,7,8,9,};
//         printArray(arr, idx:0);
//         }
    
// }



//2. print the max value of the array [3,10,2,5,3].



// public class recursion32 {

//     // static void printAray(int[] arr, int idx){

//         static int maxInArray(int[] arr, int idx){
//             // base case 
//             if(idx == arr.length-1){
//                 return arr[idx];
//             }


//             // small problem --> idx + 1 , end of the array --> max --> return
//             int samllAns = maxInArray(arr, idx+1);

//            return Math.max(samllAns, arr[idx]);
//         }

        
      
    
//     public static void main(String[] args) {
//         int  [] arr = {5,6,7,8,9,};
//        System.out.println(maxInArray(arr,0));
        
//     }
// }

// time complexity = (n)
// space complexity = (n)




// 3. Find the sum of the elements of the array [ 2,3,5,20,1].




// public class recursion32 {

    // static void printAray(int[] arr, int idx){

        // static int sumOfArray(int[] arr, int idx){
            // base case 
            // if(idx == arr.length){
            //     return 0;
            // }
            // recursive work
            // int smallAns  =  sumOfArray(arr, idx +1);

            // self work

//             return smallAns + arr[idx];

//         }

    
//     public static void main(String[] args) {
//         int  [] arr = {1,2,3,4};
//        System.out.println(sumOfArray(arr,0));
        
//     }
// }

 



// 8 jan 

//3. Given an array of n integers and a target value x. Print whether x exists in the array or not.
//time complexity = (n)
// space complexity = (n)

// public class recursion32 {

//         static boolean Search(int[] arr,int n, int target, int idx){
//             // base case 
//             if(idx>=n){
//                 return false;
//             }
//             // self work
//             if(arr[idx]==target)return true;
            
            
//             // recursive work
//             return Search(arr,n,target,idx+1);

//         }
 
    
//     public static void main(String[] args) {
//         int  [] arr = {1,2,4,6};
//         int target = 4;
//        if(Search(arr, arr.length,target, 0)){
//         System.out.println("YES");
//        }else{
//         System.out.println("NO");
//        }
        
//     }
// }


// 4.for the first time appearanaces return index of target if target is present in array,otherwise -1.

// public class recursion32 {

//     static int findIndex(int[] arr,int n, int target, int idx){
//         // base case 
//         if(idx>=n){
//             return -1;
//         }
//         // self work
//         if(arr[idx]==target)return idx;
        
        
//         // recursive work
//         return findIndex(arr,n,target,idx+1);

//     }


// public static void main(String[] args) {
//     int  [] arr = {1,2,4,6};
//     int target = 4;
//     int n = arr.length;
//     System.out.println(findIndex(arr,n,target,0));

// }
// }





//5. Given an array of size N and an integer X. The task is so to find all the indices of the integers X in the array.
// Input arr = {1,2,3,2,2,2,5} X =2
// output 1 3 4 5
public class recursion32 {

    static void findAllIndices(int[] arr,int n, int target, int idx){
        // base case 
        if(idx>=n){
            return;
        }
        // self work
        if(arr[idx]==target){
            System.out.println(idx);
        } 
        
        
        // recursive work
        findAllIndices(arr,n,target,idx+1);

    }


public static void main(String[] args) {
    int  [] arr = {1,2,3,2,2,2,5};
    int target = 2;
    int n = arr.length;
    findAllIndices(arr,n,target,0);

}
}