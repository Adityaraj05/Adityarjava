// Given an array of integer of size n . Answer q  quries where you need to print the sum of value in a given range of indices from 1 to r (both includeed) the vlaues of 1 ans r in quries follow 1-based indexing.


import java.util.*;

public class pro_01_nov {

    // static void prefSum(int[] arr) {
     
    //         int n = arr.length;
    //         for (int i = 0; i < n; i++) {
    //             System.out.println(arr[i] + " ");
    //         }
    //         System.out.println();
    //     }
        

    

    static int[] makePrefixSumArray(int[] arr) {
       
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }

        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 1; i <= n; i++) {  // one based indexing
            arr[i] = sc.nextInt();
        }
      
        int[] prefSum = makePrefixSumArray(arr);
       
        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();
        while(q-->0){
            System.out.println("Enter range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r]-prefSum[l-1];

            System.out.println("Sum"+ ans );
        }

    }

}

// output
// Enter array size: 
// 5 
// Enter 5 elements: 
// 1 2 3 4 5 
// Enter number of queries: 
// 3
// Enter range: 
// 1 5 
// Sum15
// Enter range:
// 2 2 
// Sum2
// Enter range:
// 1 4 