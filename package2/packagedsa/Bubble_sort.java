// *--> we do a certain no. of passes and in every pass, we comapare adjacent elements and swap them if they are not in correct order.

// 2.In every iteration, the largest number in part of array to be processed gets its correct position .

// Increasing order

// Time complexity worst and avg. case = O(n^2)

// optimal code of bubble   best case time complexity: O(n)
// bubble sort is a stable operator



// note : Stable and Unstable operators

public class Bubble_sort {

    static void sort(int[] a) {
        int n = a.length;

        // n-1 iterations/passes
        for (int i = 0; i < n - 1; i++) {

            boolean flag = false; // has any swapping happend
            for (int j = 0; j < n - i - 1; j++) {
                // last i elemnts are already sorted position so no need to check them.

                if (a[j] > a[j + 1]) {
                    // swap --> a[j] , a[j+1]

                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;// some swap has hapened
                }

            }
            if (flag == false) { // have any swap happened?
                return;
            }

        }

    }

    public static void main(String[] args) {
        int[] a = { 7, 6, 5, 4, 3 };
        sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
