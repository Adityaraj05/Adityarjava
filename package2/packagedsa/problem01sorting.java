// Given an integer array arr, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

// input: 0 5 0 3 42 
// output:5 3 42 0 0


// public class problem01sorting {
    
//     static void sort(int[] a) {
//         int n = a.length;

//         // n-1 iterations/passes
//         for (int i = 0; i < n - 1; i++) {

//             boolean flag = false; // has any swapping happend
//             for (int j = 0; j < n - i - 1; j++) {
//                 // last i elemnts are already sorted position so no need to check them.

//                 if (a[j]==0  && a[j+1]!=0) {
//                     // swap --> a[j] , a[j+1]

//                     int temp = a[j];
//                     a[j] = a[j + 1];
//                     a[j + 1] = temp;
//                     flag = true;// some swap has hapened
//                 }

//             }
//             if (flag == false) { // have any swap happened?
//                 return;
//             }

//         }

//     }

//     public static void main(String[] args) {
//         int[] a = {0,5,0,0,0};
//         sort(a);
//         for (int i : a) {
//             System.out.print(i + " ");
//         }
//     }

// }



// Q2. Given an array of names of the frutis; you are supposed to sort it in lexicographical order(dictionary order) using the selection sort.

// input: ["papaya","lime","watermelon","apple","mango","kiwi"]

// output: ["apple","kiwi","lime","mango","papaya","watermelon"]
// example: 1<10<100<2<20 (compare with first character first)
public class problem01sorting {
    static void sortFruits(String[] fruits){
        int n = fruits.length;

        for(int i = 0; i < n-1; i++){ //i will respersent the current index.

            // Find the element index in th unsorted part of the array.
            int min_index = i;
            for(int j= i+1; j <n; j++){
                if(fruits[j].compareTo(fruits[min_index])<0){
                min_index = j;
                }
            } 
            // swap current element and minimun element --> current index i will have correct element
            // arr[min_index] = arr[i]

            String temp = fruits[i];
            fruits[i] =fruits[min_index];
            fruits[min_index]=temp;

    }
}
    public static void main(String[] args) {
        String[] fruits = {"apple","lime","kiwi","mango","papaya","watermelon"};
        sortFruits(fruits);
        for(String val: fruits) {
            System.out.print(val + " ");
        }
        
    }
    
}



        
    

