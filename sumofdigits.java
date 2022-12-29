import java.util.Scanner;
public class sumofdigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumofdigits = 0;
        int original_n = n;
        while(n>0){
            int lastdigits = n%10; 
            sumofdigits+=lastdigits;
            n = n/10;

        
        }
        System.out.println("Number of digits is "+original_n+ " = " + sumofdigits);
    } 
    
}