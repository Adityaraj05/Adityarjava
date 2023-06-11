// defination: Select an elements and puts it as its correct element.

// sorting is done in increasing order.
// space complexity = O(1)
// time complexity= O(n^2

// selection sort is not stable algortihm but it is an in-place algorithm (because it is not using any extra space).
\


public class Selcectonsort {
    static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){ //i will respersent the current index.

            // Find the element index in th unsorted part of the array.
            int min_index = i;
            for(int j = i+1; j <n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }


            }
            // swap current element and minimun element --> current index i will have correct element
            // arr[min_index] = arr[i]

            int temp = arr[i];
            arr[i] =arr[min_index];
            arr[min_index]=temp;

    }
}
    public static void main(String[] args) {
        int[] arr = {7,4,5,1,2};
        selectionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    
}
