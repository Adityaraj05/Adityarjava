
// Given an integer array'a', sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
import java.util.*;

public class twopointer_24nov {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    // to reverse a function we write this method

    // static void swap(int[] arr, int i, int j) {
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }
    // static void reverse(int[] arr) {
    //     int i = 0, j = arr.length-1;
    //     while(i<j);{
    //         swap(arr, i, j);
    //         i++;
    //         j--;

    //     }
    // }

    static int[] sorySquares(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = n-1;

        while (left <= right) {
            if (Math.abs(arr[left])> Math.abs(arr[right])) {
                ans[k--]= arr[left] *arr[left];
                left++;
        
               
            }else{
                ans[k--]= arr[right] *arr[right];
                right--;

            }

        }
        // reverse(ans);
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("original array: " + arr.length);
        printArray(arr);
        int[] ans = sorySquares(arr);
        ;
        System.out.println("Sorted array :");
       
        printArray(ans);
    }
}
