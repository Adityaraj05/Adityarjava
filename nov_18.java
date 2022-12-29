
// Find the total number of pairs in the Array whose sum is equal to the given value x.
import java.util.Scanner;

public class nov_18 {
    static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;

                }
            }
        }

        return ans;
    }



    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = sc.nextInt();
    int [] arr = new int[n];

    System.out.println("Enter  "+ n + " elements");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();

    }
    System.out.println("Enter the target sum");
    int target = sc.nextInt();
    System.out.println(pairSum(arr, target));
    }



}
