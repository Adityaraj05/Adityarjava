import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle "); 
        float p = sc.nextFloat();

        System.out.println("Enter the Interset ");
        float r = sc.nextFloat();
        
        System.out.println("Enter the Time ");
        float t = sc.nextFloat();
        float s1 =(p*t*r)/100;
        System.out.println("principle "+p);
        System.out.println("Interset "+r);
        System.out.println("Time "+t);
        System.out.println("Simple Interset "+s1);



    }


    
}
