
// we done by sorting digit by digit or place value / position of digit in a number.




// public class Radic_Sort{
    
//     static int findMax(int[] arr){
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] > max){
//                 max = arr[i];

//              }

//          }
//          return max;
//         }

//      static void count_Sort(int[] arr, int place){
//         int n= arr.length;
//          int[] output = new int[n];
//          int[] count = new int[10];
//          for(int i=0; i<arr.length; i++){ // make frequency array
//             count[(arr[i]/place)%10]++;
//         }
//         // make prefix sum array of count array
//         for(int i=1; i<count.length; i++){ //TC-->max
//             count[i] += count[i-1];

//         }
//         // find the index of each element in the original arrya and put it in output array
//         for(int i = n-1; i>=0; i--){  //Tc -->n
//             int idx  =count[(arr[i]/place)%10] -1;
//             output[idx] = arr[i];
//             count[(arr[i]/place)%10]--;
//         }
//         // copy all the elements of the output array
//         for(int i=0; i<n; i++){ // TC-->n
//             arr[i]=output[i];
//         }


 
//     }
//      static void raidxSort(int[] arr){
//         int max = findMax(arr); //get the maximum element
//         // apply counting sort to sort elements based on place value

//         for(int place = 1; max/place >0; place *= 10){
//             count_Sort(arr, place);
//         }
//      }




//     public static void main(String[] args) {
//         int[] arr = {43, 453, 626, 894, 0, 3};
//         raidxSort(arr);
//         for(int val: arr){
//             System.out.print(val + " ");
//         }
//         System.out.println();

        
//     }
    
// }



// 4. Bucket sort (in the case uniform distribution bucket sort performed best among these three sorting mehtod)



// put all elements in the bucket  no. of buckets
// sort each bucket individually.
// take out all elements and join them

// timecomplexity:  best --O(n) and worst case(n^2)


// Q.  sort an array having numbers in range[0.0 , 1.0] with uniform distribution. Efficient way to sort .
import java.util.ArrayList;
import java.util.Collections;
public class Radic_Sort{
    static void bucketSort(float[] arr){
        int n = arr.length;
        // Bucket
        int[] a = new int[5];
        ArrayList<Float>[] buckets = new ArrayList[n];
        // Create empty bucket
        for(int i = 0; i < n; i++){
            buckets[i] = new ArrayList<Float>();
        }
        // Add elements into our bucket
        for(int i = 0; i < n; i++){
            int bucketIndex = (int) arr[i] *n;
        buckets[bucketIndex].add(arr[i]); 
        }       


    
    // sort each method individually.

    for(int i=0; i<buckets.length; i++){
        Collections.sort(buckets[i]);
    }

    // Merge all buckets to get final sorted array
    int index = 0;
    for(int i = 0; i < buckets.length; i++){
        ArrayList<Float>currBucket= buckets[i]; 
        for(int j = 0; j < currBucket.size(); j++){
            arr[index++]= currBucket.get(j);
        }
    }
}

    





    public static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        bucketSort(arr);
        for(float val: arr) {
            System.out.println(val +" ");
        }    
    }
}   

