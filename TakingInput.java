import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        // if we want to make the space between the line and print all the word then we
        // have to use nextLine for that or for one word simply type scnext()
        String name = sc.nextLine();
        System.out.println("Name is: " + name);

        System.out.println("Eneter your lucky number");
        int num_1 = sc.nextInt();

        System.out.println("Lucky number is " + num_1);

    }

}
