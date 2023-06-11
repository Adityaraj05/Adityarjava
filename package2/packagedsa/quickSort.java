// It is inplace 
// it is divide and concquer
// it is not a unstable algorithm.

// time complexity: avg and best case o(nlogn)
// worst case O(n^2) mainly avoid this case by taking random pivot element btw start and end. dont pick the first no. as a pivot element.

// space complexity:  avg and best O(logn) and in worst case O(n)


// Partition Algorithm:== 1> chose pivot and we put in at its right position (pivot index)
// 2> We rearrange elements before and after pivot index such that (smaller elements  pivot element  greater elements).



public class quickSort {

    static void displayArr(int[] arr){
        for(int val: arr){
            System.out.print(val + " ");
        }
    }

    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] =arr[y];
        arr[y] =temp;
    }
   

    static int partition(int[] arr, int start, int end){ 
        int pivot = arr[start];
        int count = 0;
        for(int i = start+1; i <= end; i++){
            if(arr[i] <=pivot) count++;
        }
        int pivotIdx =  start + count;
        swap(arr, start , pivotIdx);
        int i = start , j = end;
// element lesser than or equal to pivotIdx , greater than -->right side of the pivotIndx
        while(i<pivotIdx && j >pivotIdx){
            while(arr[i]<=  pivot) i++;
            while(arr[j] > pivot) j--;

            if(i<pivotIdx && j>pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
     static void quicl_Sort(int[] arr, int start, int end){
        if(start>= end)return;
        int pi = partition(arr, start, end);
        quicl_Sort(arr, start, pi-1);
        quicl_Sort(arr, pi+1, end);
        


     }
    public static void main(String[] args) {
        int[] arr= {6,3,1,5,4};
        System.out.println("Array before sorting");
        displayArr(arr);
        System.out.println();
        quicl_Sort(arr, 0 , arr.length-1);
        System.out.println("Array after sorting");
        displayArr(arr);
        
    }
    
 }
    
