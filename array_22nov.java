import java.util.Scanner;
public class array_22nov {
    static int rotate(int[] arr,  int k) {
        int n = arr.length;
        
        
        k = K % n;
        int [] ans= new int[n];
        int j = 0;


       

        for (int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];
        }
        for(int i = n-k; i < n; i++) {
            ans[j++] = arr[i];
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
        System.out.println("Original array");
        rotate(arr);
        int[] ans = rotate(arr , k);
        System.out.println("Arrays after rotation");
    }

       
}
  
