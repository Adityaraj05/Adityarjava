import java.util.Scanner;
public class conversionbinarytodecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int binary_nums = sc.nextInt();


        int ans = 0; // convert decimal number 
        int pw = 1; // 2^0 = 1
        while(binary_nums > 0){
            int unit_digit = binary_nums % 10;
            ans += (unit_digit * pw);
            binary_nums /= 10;
            pw*=2;

        }
        System.out.println(ans);



       
            
        
    
        
    }
}
