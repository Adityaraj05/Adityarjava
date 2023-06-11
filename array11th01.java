// Write a program to check given string is palindrome or not . ex: level
// import java.util.*; 
// time complexity : O(n^2)
// public class array11th01 {
//     static String reverse(String s, int idx) {
//         if(idx == s.length()) return "";
//         String smallAns = reverse(s, idx+1);
//         return smallAns + s.charAt(idx);


//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String rev = reverse(s,0);
//         System.out.println(reverse(s,0));
//         if(rev.equals(s)){
//             System.out.printf("%s is Palindrome", s);
//         }else{
//             System.out.printf("%s is Not Palindrome", s);
//         }


        
//     }
// }

// using recursion  method 2 approach.
// time complexity : O(n)
// import java.util.*; 
// public class array11th01 {
//     static boolean isPalindrome(String s, int l, int r) {
//         if(l>=r) return true;
//         return (s.charAt(l)==s.charAt(r) && isPalindrome(s, l+1, r-1));
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         System.out.println(isPalindrome(s, 0,s.length()-1));
        


        
//     }
// }    













