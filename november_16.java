import java .util.Scanner;
public class november_16 {
    static void printArrray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }  
        System.out.println();
    } 

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        // System.out.println("Enter size of array: ");
        // int n = sc.nextInt();
        int[] arr = new int [5];
        arr[0]=5;
        arr[1]=6;
        arr[2]=2;
        arr[3]=8;
        arr[4]=1;








        // System.out.println("Enter " + n + " elements");
        // for(int i = 0; i < n; i++){
        //     arr[i] = sc.nextInt();
        // }
        System.out.println("Original array");
        printArrray(arr);

        // trying to copy arr to arr_2
         int[] arr_2 = arr.clone();// clone means we get five more space in heap uska address kuch or hai
        // int []arr_2 = Arrrays.copyOf(arr, arr.length);
         System.out.println("Copied array_2 ");
         printArrray(arr_2);


        //  changing some vlaues of arr_2
        arr_2[0]=9;
        arr_2[1]=0;
        System.out.println("original array after changing arr_2");
        printArrray(arr);

        System.out.println("Copied array_2 after changing arr_2");
        printArrray(arr_2);
         
    }
} 





// array reference in java
