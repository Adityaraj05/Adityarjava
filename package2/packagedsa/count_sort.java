// count Sort ==> 1.Count sort is the non comparison based algorithm. (non-comparison)
//2. Range of number is define then we use the count sort . 
// 3. it is not inplace memory.  

// arr: 4 3 1 5 3 1 3 5
// frequ: 0 2 0 3 4 2
// count: 0 1 2 3 4 5 
// ans: 1 1 3 3 3 4 5 5 


// public class count_sort {


//     static int findMax(int[] arr){
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] > max){
//                 max = arr[i];

//              }

//          }
//          return max;
//     }
//     static void basicSort(int[] arr){
//         // find the largest element in the array .
//         int max = findMax(arr);
//         int[] count = new int[max+1];
//         for(int i = 0; i < count.length; i++){
//             count[arr[i]]++;
//         }
//         int k= 0;
//         for(int i = 0; i < count.length; i++){
//             for(int j = 0; j < count[i]; j++){
//                 arr[k++] = i;
//             }
//         }
        
//     }



//      static void display(int[] a){
//         for(int val: a ){
//             System.out.println(val + "");

//         }
//      }

//     public static void main(String[] args) {
//         int[] arr = {1 ,4, 5, 2, 2, 5};
//         basicSort(arr);
//         display(arr);
//     }
    
// }


// 2.   This algorithm is stable.

// Time complexity - wc and avg case : (n+k)
// and best case : (n)


// and space complexity - (n+k);



public class count_sort {


    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];

             }

         }
         return max;
    }
    // static void basicSort(int[] arr){
    //     // find the largest element in the array .
    //     int max = findMax(arr);
    //     int[] count = new int[max+1];
    //     for(int i = 0; i < count.length; i++){
    //         count[arr[i]]++;
    //     }
    //     int k= 0;
    //     for(int i = 0; i < count.length; i++){
    //         for(int j = 0; j < count[i]; j++){
    //             arr[k++] = i;
    //         }
    //     }
        
    // }



     static void display(int[] a){
        for(int val: a ){
            System.out.print(val + " ");

        }
     }

     static void count_Sort(int[] arr){
        int n= arr.length;
         int[] output = new int[n];
         int max = findMax(arr); 
         int[] count = new int[max+1];
         for(int i=0; i<arr.length; i++){ //make frequency array  ans time complexity --> TC-->n
            count[arr[i]]++;
        }
        // make prefix sum array of count array
        for(int i=1; i<count.length; i++){ //TC-->max
            count[i] += count[i-1];

        }
        // find the index of each element in the original arrya and put it in output array
        for(int i = n-1; i>=0; i--){  //Tc -->n
            int idx  =count[arr[i]] -1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        // copy all the elements of the output array
        for(int i=0; i<count.length; i++){ // TC-->n
            arr[i]=output[i];
        }



    }



    public static void main(String[] args) {
        int[] arr = {1 ,4, 5, 2, 2, 5};
        count_Sort(arr);
        // basicSort(arr);
        display(arr);
    }
    
}
