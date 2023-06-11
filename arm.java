import java.util.Scanner;
public class arm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;  
            sum = sum + (rem*rem*rem);
            num = num/10;
        }
        if(temp == sum){
            System.out.println("armstrong number"+sum);
        }
        else{
            System.out.println("error ");
        }
        sc.close();
    }
} 