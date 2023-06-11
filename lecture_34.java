
// String practice.

import java.util.Scanner;
public class lecture_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        char ch  = s.charAt(0); // to get the index value.
        // for(int i = 0; i < s.length(); i++) {
        //     System.out.println(s.charAt(i));
        // }

        System.out.println(s.substring(2, 4));//begin index in inclusive and last index in exclusive.
        // we can also give only first index it will print till the last .

    }
    
}
