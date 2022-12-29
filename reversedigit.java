import java.util.Scanner;
public class reversedigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reversedNum = 0;

        int original_n =n;
        while(n>0){
            int ans  = n % 10;
            reversedNum = reversedNum *  10 + ans; 
            n = n / 10; 
            
        }
        System.out.println("Number of digits is "+ original_n+ " = " + reversedNum);
    } 
    
}