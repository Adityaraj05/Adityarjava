// Take one element from the unsorted part and iterate through the sorted part and find the correct position.

// time complexity = best case O(n) , worst case as well as in avg case=  O(n^2) 
// space complexity = O(1)
// it is a stable algorithm ans inplace.


public class insertion {
    static void insertionSort(int[] a){
        int n = a.length;
        for(int i = 1; i < n; i++){
            int j = i;
            while((j>0) && (a[j] < a[j-1]) ){
                //swap a[j], a[j-1]
                int temp = a[j]; 
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
        


    }

    public static void main(String[] args) {
        int [] a = {8,3,6,5,4,2};
        insertionSort(a);
        for(int val: a){
        System.out.print(val+ " ");
        }
        
    }
    
}
